package framework.darksky;

import framework.BasePage;
import org.openqa.selenium.By;
import stepdefinition.SharedSD;

public class DarkSkySignUp extends BasePage{

    private By darkskyApiLink = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By signUpButton = By.xpath("//a[@class='button filled']");
    private By emailTextField = By.xpath("//input[@name='email']");
    private By passwordTextField = By.xpath("//input[@name='password']");
    private By reenterPassTextField = By.xpath("//input[@name='confirmation']");
    private By registerButton = By.xpath("//button[@type='submit']");













    public void clickOnAPILink() throws InterruptedException{

        clickOn(darkskyApiLink);
        Thread.sleep(2000);
    }


    public void clickOnSignUpButton() throws InterruptedException{
        clickOn(signUpButton);
        Thread.sleep(2000);
    }

    public void enterEmail() throws InterruptedException{
        setValue(emailTextField, "hello@yahoo.com");
        Thread.sleep(2000);
    }

    public void enterPassword() throws InterruptedException{
        setValue(passwordTextField, "hello");
        Thread.sleep(2000);
    }

    public void reneterPassword() throws InterruptedException{
        setValue(reenterPassTextField, "hello");
        Thread.sleep(2000);
    }

    public void clickOnRegister() throws InterruptedException{
        clickOn(registerButton);
        Thread.sleep(2000);
    }

    public void goToGmail() {
        SharedSD.getDriver();
    }



}
