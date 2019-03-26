package framework.amazon;

import framework.BasePage;
import org.openqa.selenium.By;

public class AmazonHomePage extends BasePage{

    private By accountsList= By.id("nav-link-accountList");
    private By startHere = By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]");
    private By signInButton = By.xpath("//span[@class='nav-action-inner']");
    private By createList = By.xpath("//span[contains(text(),'Create a List')]");
    private By findAList = By.xpath("//span[contains(text(),'Find a List or Registry')]");
    private By findaGift = By.xpath("//span[contains(text(),'Find a Gift')]");



        public void hoverOverAccountsList() {
            mouseOver(accountsList);
        }

        public void clickOnStartHere() {
            clickOn(startHere);
        }


}
