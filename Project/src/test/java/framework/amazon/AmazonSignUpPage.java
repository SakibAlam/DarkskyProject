package framework.amazon;

import framework.AssertionPage;
import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonSignUpPage extends BasePage {

    AssertionPage assertionPage = new AssertionPage();

    private By yourNameTextField = By.id("ap_customer_name");
    private By emailTextField = By.id("ap_email");
    private By passwordTextField = By.id("ap_password");
    private By reEnterPassword = By.id("ap_password_check");
    private By createAnAccount = By.id("continue");

    private By passShortErrorMessage = By.id("auth-password-invalid-password-alert");
    private String passShortExpectedErrorMessage = "Passwords must be at least 6 characters.";
    private By invalidEmailErrorMessage = By.id("auth-email-invalid-email-alert");
    private String invalidEmailExpectedErrorMessage = "Enter a valid email address";
    private By passwordMustMatchErrorMessage = By.id("auth-password-mismatch-alert");
    private String passwordMustMatchExpectedErrorMessage = "Passwords must match";
    private By nameMissingErrorMessage = By.id("auth-customerName-missing-alert");
    private String nameMissingExpectedErrorMessage = "Enter your name";
    private By emailMissingErrorMessage = By.id("auth-email-missing-alert");
    private String emailMissingExpectedErrorMessage = "Enter your email";
    private By passwordMissingErrorMessage = By.id("auth-password-missing-alert");
    private String passwordMissingExpectedErrorMessage = "Enter your password";
    private By reEnterPasswordMissingErrorMessage = By.id("auth-passwordCheck-missing-alert");
    private String reEnterPasswordMissingExpectedErrorMessage = "Type your password again";




    public void enterName(String name) {
        setValue(yourNameTextField, name);
    }

    public void enterEmail(String email) {
        setValue(emailTextField, email);
    }

    public void enterPassword(String pass) {
        setValue(passwordTextField, pass);
    }

    public void reEnterPassword(String rePass) {
        setValue(reEnterPassword, rePass);
    }

    public void clickOnCreateAccount() {
        clickOn(createAnAccount);
    }

    public void verifyShortPasswordErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(passShortErrorMessage, passShortExpectedErrorMessage);
    }

    public void verifyInvalidEmailErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(invalidEmailErrorMessage, invalidEmailExpectedErrorMessage);
    }

    public void verifyPasswordMustMatchErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(passwordMustMatchErrorMessage, passwordMustMatchExpectedErrorMessage);
    }

    public void verifyNoNameErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(nameMissingErrorMessage,nameMissingExpectedErrorMessage);
    }

    public void verifyNoEmailErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(emailMissingErrorMessage, emailMissingExpectedErrorMessage);
    }

    public void verifyPasswordMissingErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(passwordMissingErrorMessage, passwordMissingExpectedErrorMessage);
    }

    public void verifyReenterPasswordMissingErrorMessage() {

        assertionPage.verifyErrorMessageByGettingText(reEnterPasswordMissingErrorMessage, reEnterPasswordMissingExpectedErrorMessage);
    }
}
