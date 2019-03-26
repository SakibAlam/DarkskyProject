package framework.darksky;

import framework.AssertionPage;
import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.*;

public class DarkSkyHome extends BasePage {

    private By websitesCurrentTime = By.xpath("//span[@class='Now']");
    public By hoursOnWebsite = By.xpath("//div[@class='hours']/span/span");
    private By todayTimeLine = By.xpath("//a[1]//span[2]//span[2]");
    public By minTemp1 = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
    public By maxTemp1 = By.xpath("//a[@class='day revealed']//span[@class='maxTemp']");
    public By minTemp2 = By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']//following-sibling::span[@class='temp']");
    public By maxTemp2 = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']//following-sibling::span[@class='temp']");
    private By websiteCurrentTemp = By.xpath("//span[@class='first']");
    private By websiteAllTemp = By.xpath("//div[@id='timeline']//div[@class='temps']/span/span");

    //TASK 1

    public String now = getTextFromElement(websitesCurrentTime);

    public List expectedAllHoursList() {

        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add(now);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("ha");

        for (int i = 0; i < 11; i++) {
            calendar.add(Calendar.HOUR, 2);
            String time = sdf.format(calendar.getTime());
            String formattedTime = time.replace("AM", "am").replace("PM", "pm");
            expectedList.add(formattedTime);
        }
        return expectedList;
    }

    // TASK 2

    public void scrollToTodayTimeline() throws InterruptedException {
        scrollIntoView(todayTimeLine);
        Thread.sleep(2000);
    }

    //TASK 3

    public void verifyCurrentTemp() {

        ArrayList<Integer> intArray = new ArrayList<>();
        String currentTempString = getTextFromElement(websiteCurrentTemp).replace("°", "");
        int currentTempInt = stringToInteger(currentTempString);

        System.out.println("Current Temp is: " + currentTempInt);

        for (WebElement element : webActions(websiteAllTemp)) {
            String str = element.getText().replace("°", "");
            int a = stringToInteger(str);
            intArray.add(a);
        }

        Collections.sort(intArray);
        int minimum = intArray.get(0);
        int maximum = intArray.get(intArray.size() - 1);

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        if (currentTempInt >= minimum && currentTempInt <= maximum) {
            System.out.println("Current Temp is not greater or less than lowest and highest temp");
        }
    }
}
