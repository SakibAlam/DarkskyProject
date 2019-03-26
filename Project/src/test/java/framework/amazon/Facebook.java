package framework.amazon;

import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepdefinition.SharedSD;
import util.ConfigReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Facebook {

//    @Test
//    public void hello() {
//
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//
//
//
//
//
//
//
//            getDriver().findElement(firstName).sendKeys(name);
//
//
//        public void setLastName (String name){
//            getDriver().findElement(lastName).sendKeys(name);
//        }
//
//
//        public void setLastName1 (String number){
//            getDriver().findElement(mobileNumber).sendKeys(number);
//        }
//
//        public void setNewPassword (String password){
//            getDriver().findElement(newPassword).sendKeys(password);
//        }
//
//        public void selectFemaleButton () {
//            getDriver().findElement(femaleButton).isSelected();
//        }
//
//        public void selectMonth (By locator){
//            Select select = new Select(getDriver().findElement(locator));
//
//            select.selectByIndex(1);
//        }
//
//        public void selectDate (By locator){
//            Select select = new Select(getDriver().findElement(locator));
//            select.selectByIndex(2);
//        }
//
//        public void selectYear (By locator){
//            Select select = new Select(getDriver().findElement(locator));
//            select.selectByIndex(2);
//        }
//
//        public void clickButton () {
//            getDriver().findElement(selectButton).click();
//        }
//    }
//}

}