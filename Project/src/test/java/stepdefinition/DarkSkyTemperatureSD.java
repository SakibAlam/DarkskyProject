package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AssertionPage;
import framework.BasePage;
import framework.darksky.DarkSkyHome;

public class DarkSkyTemperatureSD {

    DarkSkyHome darkSkyHome = new DarkSkyHome();
    BasePage basePage = new BasePage();
    AssertionPage assertionPage = new AssertionPage();


    @When("^I expand today's timeline$")
    public void expandTodaysTimeline() throws InterruptedException{
        darkSkyHome.scrollToTodayTimeline();
    }

    @Then("^I verify lowest and highest temperature is displayed correctly$")
    public void verifyLowestHighest() {

        assertionPage.verifyMessageByGettingTextLocators(darkSkyHome.minTemp1, darkSkyHome.minTemp2);
        assertionPage.verifyMessageByGettingTextLocators(darkSkyHome.maxTemp1, darkSkyHome.maxTemp2);
        System.out.println(basePage.getTextFromElement(darkSkyHome.minTemp1));
        System.out.println(basePage.getTextFromElement(darkSkyHome.minTemp2));
        System.out.println(basePage.getTextFromElement(darkSkyHome.maxTemp1));
        System.out.println(basePage.getTextFromElement(darkSkyHome.maxTemp2));
    }



}
