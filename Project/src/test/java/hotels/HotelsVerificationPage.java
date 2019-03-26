package hotels;

import framework.AssertionPage;
import framework.BasePage;
import org.openqa.selenium.By;

public class HotelsVerificationPage extends BasePage{

    AssertionPage assertionPage = new AssertionPage();



    String expectedResultText = "Sat March 16 - Sat March 23, 2019, 7 nights, 1 room, 2 adults, 2 children";
    private By actualResultText = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]");


    public void verifyResultText() {
        assertionPage.verifyTextMessage(actualResultText, expectedResultText);
    }


}
