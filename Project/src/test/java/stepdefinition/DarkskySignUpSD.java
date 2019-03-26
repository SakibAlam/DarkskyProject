package stepdefinition;

import cucumber.api.java.en.When;
import framework.darksky.DarkSkySignUp;

public class DarkskySignUpSD {

    DarkSkySignUp darkSkySignUp = new DarkSkySignUp();


    @When("^I click on darkskyapi link$")
    public void clickOnAPILink() throws InterruptedException{
        darkSkySignUp.clickOnAPILink();
    }

    @When("^I click on sign up button$")
    public void clickOnSignUp() throws InterruptedException{
        darkSkySignUp.clickOnSignUpButton();
    }

    @When("^I enter email address on the email text field$")
    public void enterEmail() throws InterruptedException{
        darkSkySignUp.enterEmail();
    }

    @When("^I enter password in the password text field on darksky$")
    public void enterPassword() throws InterruptedException{
        darkSkySignUp.enterPassword();
    }

    @When("^I re enter my password on the password text field$")
    public void reEnterPass() throws InterruptedException{
        darkSkySignUp.reneterPassword();
    }

    @When("^I click on register button$")
    public void clickOnRegister() throws InterruptedException{
        darkSkySignUp.clickOnRegister();
    }



}
