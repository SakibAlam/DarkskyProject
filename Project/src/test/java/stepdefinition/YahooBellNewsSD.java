package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.yahoo.YahooHomePage;
import org.testng.Assert;

public class YahooBellNewsSD {

    private YahooHomePage yahooHomePage = new YahooHomePage();

    @Given("^I am on Yahoo home page$")
    public void iAmOnYahooHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.yahoo.com/");
    }

    @When("^I hover over the bellicon$")
    public void hoverOver() {
        yahooHomePage.goToBellIcon();
    }

    @Then("^I print the news from bellicon$")
    public void printNews() {
        yahooHomePage.printingAllNotification();
    }

}
