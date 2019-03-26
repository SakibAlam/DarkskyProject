package framework;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;
import gherkin.lexer.Ar;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by SakibAlam
 */
public class BasePage {

    // This is the most common wait function used in selenium
    public static WebElement webAction(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(SharedSD.getDriver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotFoundException.class)
                .withMessage(
                        "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return element;
    }

    public static List<WebElement> webActions(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(SharedSD.getDriver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotFoundException.class)
                .withMessage("Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

        List<WebElement> elements = wait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
        return elements;

    }


    public void scrollIntoView(By locator) throws InterruptedException {
        SharedSD.getDriver().manage().window().maximize();
        WebElement element = webAction(locator);
        ((JavascriptExecutor) SharedSD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        element.click();
    }


    public void clickOn(By locator) {
        webAction(locator).click();
    }

    public void setValue(By locator, String value) {
        webAction(locator).sendKeys(value);
    }

    public String getTextFromElement(By locator) {
        return webAction(locator).getText();
    }

    public List getTextFromElements(By locator) {

        List<WebElement> lists = (webActions(locator));
        ArrayList<String> list2 = new ArrayList<>();
        for(WebElement element : lists) {
            list2.add(element.getText());
        }
        return list2;
    }

    public void selectFromDropDown(By locator, String string) {
        Select dropDown = new Select(webAction(locator));
        dropDown.selectByVisibleText(string);
    }

    public void selectFromDropDown(By locator, int index) {
        Select dropDown = new Select(webAction(locator));
        dropDown.selectByIndex(index);
    }

    public void autoComplete(By locator, String expectedString) {
        List<WebElement> strings = webActions(locator);
        for (WebElement element : strings) {
            if (element.getText().contains(expectedString)) {
                element.click();
                break;
            }
        }
    }


    public Integer stringToInteger(String text) {
        int value = Integer.parseInt(text);
        return value;
    }

    public String replaceFromString(String value1, String value2, String value) {
        String value3 = value.replace(value1, value2);
        return value3;
    }

    public void replaceFromStringWithGettingText(){

    };


    public int findingSmallestFromArrayList(ArrayList<Integer> arrayList) {
        int value = arrayList.get(0);
        for(int a : arrayList) {
            if(a < value) {
                value = a;
            }
        }
        return value;
    }

    public int findingLargestFromArraylist(ArrayList<Integer> arrayList) {
        int value = arrayList.get(0);
        for(int a : arrayList) {
            if(a > value) {
                value = a;
            }
        }
        return value;
    }

    public void selectAnyHour() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        String anyHour = sdf.format(calendar.getTime());
        //clickOn(By.linkText(anyHour));
    }


    public void selectAnyDate(int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, date);
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        String anyDate = sdf.format(calendar.getTime());
        clickOn(By.linkText(anyDate));

    }

    public void selectAnyMonth(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, month);
        SimpleDateFormat sdf = new SimpleDateFormat("MMM");
        String anyMonth = sdf.format(calendar.getTime());
        clickOn(By.linkText(anyMonth));

    }

    public void selectAnyYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, year);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String anyYear = sdf.format(calendar.getTime());
        clickOn(By.linkText(anyYear));
    }


    public void mouseOver(By locator) {
        SharedSD.getDriver().manage().window().maximize();
        WebElement element = webAction(locator);

        Actions actions = new Actions(SharedSD.getDriver());
        actions.moveToElement(element).perform();
    }


    public boolean isElementDisplayed(By locator) {
        return webAction(locator).isDisplayed();
    }

    public boolean isElementSelected(By locator) {
        return webAction(locator).isSelected();
    }


    public boolean isElementEnabled(By locator) {
        return webAction(locator).isEnabled();
    }


}
