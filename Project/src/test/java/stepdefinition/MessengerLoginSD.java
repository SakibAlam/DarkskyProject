package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.facebook.MessengerPage;
import org.testng.Assert;

public class MessengerLoginSD {

    private MessengerPage messengerPage = new MessengerPage();


    @Given("^I am on Messenger home page$")
    public void iAmOnMessengerPage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Messenger", "Invalid Messenger Page");
    }

    @When("^I enter (.+) into (username|password) field on messenger page$")
    public void enterDataIntoTextFields(String anyText, String textFields) {

        switch (textFields) {
            case "username":
                messengerPage.enterEmail(anyText);
                break;
            case "password":
                messengerPage.enterPass(anyText);
                break;
        }

    }

    @When("^I click on sign up button on messenger page$")
    public void clickOnLogin() {
        messengerPage.clickOnLogIn();
    }

    @Then("^I verify invalid login error message$")
    public void verifyErrorMessage() {
        messengerPage.verifyErrorMessage();
    }


}
