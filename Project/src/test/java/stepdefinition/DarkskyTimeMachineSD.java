package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AssertionPage;
import framework.BasePage;
import framework.darksky.DarkSkyHomepage;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DarkskyTimeMachineSD {

    DarkSkyHomepage darkskyHomepage = new DarkSkyHomepage();
    AssertionPage assertionPage = new AssertionPage();
    BasePage basePage = new BasePage();

    @Given("^I am on Darksky home page$")
    public void iAmOnDarkskyHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://darksky.net/forecast/40.756,-73.898/us12/en");
    }

    @When("^I click on time machine button$")
    public void clickOnTimeMachine() throws InterruptedException{
        darkskyHomepage.clickOnTimeMachine();
    }

    @Then("^I verify today's date is selected$")
    public void verifyTodayDateSelected() {
        String todaysDateFromWebsiteText = basePage.getTextFromElement(darkskyHomepage.currentWebsiteDate);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        String todaysDateFromMachineText = sdf.format(calendar.getTime());
        System.out.println(todaysDateFromMachineText);
        System.out.println(todaysDateFromWebsiteText);
        assertionPage.verifyTwoStrings(todaysDateFromMachineText, todaysDateFromWebsiteText);
    }

}
