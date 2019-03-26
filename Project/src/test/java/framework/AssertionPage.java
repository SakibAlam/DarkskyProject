package framework;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class AssertionPage extends BasePage{

    public void verifyErrorMessageByGettingText(By locator, String expectedErrorMessage) {
        String actualErrorMessage = getTextFromElement(locator);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    public void verifyMessageByGettingTextLocators(By locator1, By locator2) {
        String actualErrorMessage = getTextFromElement(locator1);
        String actualErrorMessage2 = getTextFromElement(locator2);
        Assert.assertEquals(actualErrorMessage, actualErrorMessage2);
    }


    public void verifyTextMessage(By locator, String expectedTextMessage) {
        String actualTextMessage = getTextFromElement(locator);
        Assert.assertEquals(actualTextMessage, expectedTextMessage);
    }

    public void verifyTwoLists(List expectedList, List actualList) {
        Assert.assertEquals(expectedList, actualList);
    }

    public void verifyTwoStrings(String text1, String text2) {
        Assert.assertEquals(text1, text2, "not equal");
    }

}
