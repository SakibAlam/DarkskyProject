package framework.facebook;

import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefinition.SharedSD;

public class MessengerPage extends BasePage {


    private By messengerEmail = By.id("email");
    private By messengerPassword = By.id("pass");
    private By logInButton = By.id("loginbutton");
    private By errorMassage = By.xpath("//div[contains(text(),'Incorrect Email')]");
    private String expectedErrorText = "Incorrect Email";


    public void enterEmail(String email) {
        setValue(messengerEmail, email);
    }

    public void enterPass(String pass) {
        setValue(messengerPassword, pass);
    }

    public void clickOnLogIn() {
        clickOn(logInButton);
    }


    public void verifyErrorMessage(){
        String actualErrorMessage = webAction(errorMassage).getText();

        Assert.assertEquals(expectedErrorText,actualErrorMessage);
    }

}
