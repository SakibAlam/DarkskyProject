package framework.yahoo;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YahooHomePage extends BasePage{

    private By bellIcon = By.id("uh-notifications");
    private By classForNews = By.className("yns-container");


    public void goToBellIcon() {
        mouseOver(bellIcon);
    }


    public void printingAllNotification() {
        List<WebElement> newsList = webActions(classForNews);

        for (WebElement sakib : newsList) {
            String news = sakib.getText();
            System.out.println(news);
        }
    }
}
