package framework.darksky;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class DarkSkyHomepage extends BasePage {

    public By timeMachineButton = By.xpath("//a[@class='button']");

    public By a = By.xpath("//td[@data-day='");
    public By c = By.xpath("']");


    public By currentWebsiteDate = By.xpath("//td[@class='is-today']");
    public By allTheDatesFromCalender = By.xpath("//td[@data-day]");


    public void clickOnTimeMachine() throws InterruptedException {
        scrollIntoView(timeMachineButton);
        Thread.sleep(2000);
    }


    public void checkTodaysDate() {


        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        String todaysDate = sdf.format(calendar.getTime());

        String actualWebsiteTodaysDate = webAction(currentWebsiteDate).getText();
        //System.out.println("HAppy : " + actualWebsiteTodaysDate);
        //Assert.assertEquals(actualWebsiteTodaysDate, todaysDate);

        // System.out.println(todaysDate);

        List<WebElement> listsOfDates = webActions(allTheDatesFromCalender);
        System.out.println("Length " + listsOfDates.size());


        for (WebElement element : listsOfDates) {
            if (element.getText().equals(todaysDate)) {
//                        Assert.assertEquals(element, todaysDate);
                System.out.println("its working");
            }

        }


        //System.out.println(webAction(allTheDatesFromCalender).getText());


    }

}
