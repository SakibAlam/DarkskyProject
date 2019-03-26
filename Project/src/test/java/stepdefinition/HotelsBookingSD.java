package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hotels.HotelsHomePage;
import hotels.HotelsVerificationPage;
import org.testng.Assert;

public class HotelsBookingSD {

    HotelsHomePage hotelsHomePage = new HotelsHomePage();
    HotelsVerificationPage hotelsVerificationPage = new HotelsVerificationPage();


    @Given("^I am on Hotels home page$")
    public void iAmOnHotelsHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.hotels.com/");
    }


    @When("^I click on the (checkInButton|checkoutButton|searchField|searchButton)$")
    public void clickOnCheckInDate(String anyButton) throws InterruptedException {
        switch ((anyButton)) {
            case "checkInButton":
                hotelsHomePage.clickOnCheckInDate();
                break;
            case "checkoutButton":
                hotelsHomePage.clickOnCheckOutDate();
                break;
            case "searchField":
                hotelsHomePage.clickOnSearchButton();
                break;
            case "searchButton":
                hotelsHomePage.clickOnSearchButton();

        }

    }

    @When("^I type (.+) in the text field$")
    public void typingTheDestination(String text) {
        hotelsHomePage.typeLocationInTheTextField(text);
    }

    @When("^I choose (.+) from the result$")
    public void choosingExpectedDestination(String expectDestination) throws InterruptedException {
        hotelsHomePage.selectingFromTheAutoSuggestion(expectDestination);
    }


    @When("^I select (.+) day from today's date$")
    public void selectingTomorrowsDate(int date) throws InterruptedException {
        hotelsHomePage.selectDateFromCheckIn(date);
    }


    @When("^I verify it says (.+) days on the side$")
    public void verifyingNightsSelected(String text) throws InterruptedException {
        hotelsHomePage.verifyNightsSelected(text);
    }

    @When("^I click on (.+) dropdown menu$")
    public void selectingFirstDropDown(int value) throws InterruptedException {
        hotelsHomePage.selectingFromFirstDropDown(value);
    }

    @When("^I select (.+) from dropdown (rooms|adults|children) menu$")
    public void selectingAdultsFromDropDown(int number, String dropDown) throws InterruptedException {

        switch (dropDown) {
            case "rooms":
                hotelsHomePage.selectFromRoomDropDown(number);
                break;
            case "adults":
                hotelsHomePage.selectFromAdultDropDown(number);
                break;
            case "children":
                hotelsHomePage.selectFromChildrenDropDown(number);
                break;
        }

    }


    @When("^I select age as (.+) from the (first|second) children dropdown$")
    public void selectingFirstChildAge(int number, String dropDown) throws InterruptedException {
        switch (dropDown) {
            case "first":
                hotelsHomePage.selectingForthDropDown(number);
                break;
            case "second":
                hotelsHomePage.selectingFifthDropDown(number);
        }
    }


    @Then("^I verify the result text on the next page$")
    public void verifyResultText() {
        hotelsVerificationPage.verifyResultText();
    }
}
