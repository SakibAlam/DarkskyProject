package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.amazon.AmazonHomePage;
import framework.amazon.AmazonSignUpPage;
import org.testng.Assert;

public class AmazonSignUpSD {

    private AmazonHomePage amazonHomePage = new AmazonHomePage();
    private AmazonSignUpPage amazonSignUpPage = new AmazonSignUpPage();


    @Given("^I am on Amazon home page$")
    public void iAmOnAmazonPage() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.amazon.com/", "piash bhai");
    }

    @When("^I hover over Accounts & lists$")
    public void hoverOver() {
        amazonHomePage.hoverOverAccountsList();
    }

    @When("^I click on [sS]tart here$")
    public void clickOnStartOver() {
        amazonHomePage.clickOnStartHere();
    }

    @When("^I enter (.+) in the (yourname|email|password|reenterpassword) text field$")
    public void enterDataIntoTextFields(String anytext, String textField) {

        switch (textField) {
            case "yourname":
                amazonSignUpPage.enterName(anytext);
                break;
            case "email":
                amazonSignUpPage.enterEmail(anytext);
                break;
            case "password":
                amazonSignUpPage.enterPassword(anytext);
                break;
            case "reenterpassword":
                amazonSignUpPage.reEnterPassword(anytext);
                break;
        }
    }

    @When("^I put (.*)in the (yourname|email|password|reenterpassword) text field$")
    public void enterNothingIntoTextFields(String anyText, String textField) {
        switch (textField) {
            case "yourname":
                amazonSignUpPage.enterName(anyText);
                break;
            case "email":
                amazonSignUpPage.enterEmail(anyText);
                break;
            case "password":
                amazonSignUpPage.enterPassword(anyText);
                break;
            case "reenterpassword":
                amazonSignUpPage.reEnterPassword(anyText);
                break;
        }
    }

    @When("^I click on create your amazon account$")
    public void clickCreateAccount() {
        amazonSignUpPage.clickOnCreateAccount();
    }

    @Then("^I verify short password error message$")
    public void verifyErrorMessage() {
        amazonSignUpPage.verifyShortPasswordErrorMessage();
    }

    @Then("^I verify invalid email error message$")
    public void verifyInvalidEmailErrorMessage() {
        amazonSignUpPage.verifyInvalidEmailErrorMessage();
    }

    @Then("^I verify password must match error message$")
    public void verifyPasswordMustMatchErrorMessage() {
        amazonSignUpPage.verifyPasswordMustMatchErrorMessage();
    }

    @Then("^I verify name missing error message$")
    public void verifyNameMissingErrorMessage() {
        amazonSignUpPage.verifyNoNameErrorMessage();
    }

    @Then("^I verify email missing error message$")
    public void verifyEmailMissingErrorMessage() {
        amazonSignUpPage.verifyNoEmailErrorMessage();
    }

    @Then("^I verify password missing error message$")
    public void verifyPasswordMissingErrorMessage() {
        amazonSignUpPage.verifyPasswordMissingErrorMessage();
    }

    @Then("^I verify reenter password missing error message$")
    public void verifyReenterPasswordMissingErrorMessage() {
        amazonSignUpPage.verifyReenterPasswordMissingErrorMessage();
    }

    @Then("^I verify leaving all fields empty error message$")
    public void verifyAllFieldsEmptyErrorMessage() {
        amazonSignUpPage.verifyNoNameErrorMessage();
        amazonSignUpPage.verifyNoEmailErrorMessage();
        amazonSignUpPage.verifyPasswordMissingErrorMessage();
    }
}
