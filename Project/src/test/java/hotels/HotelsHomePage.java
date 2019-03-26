package hotels;

import framework.AssertionPage;
import framework.BasePage;
import org.openqa.selenium.By;

public class HotelsHomePage extends BasePage{

    AssertionPage assertionPage = new AssertionPage();

            private By destinationTextField = By.id("qf-0q-destination");

            private By listOfCities = By.xpath("//tbody[@class='autosuggest-city']/descendant::tr");

            private By checkInDate = By.id("qf-0q-localised-check-in");
            private By checkOutDate = By.id("qf-0q-localised-check-out");
            private By numberOfNightsDisplayed = By.xpath("//*[@id=\"qf-0q-nights\"]/span[1]/span");
            private By roomsAndAdultsDropDown = By.id("qf-0q-compact-occupancy");
            private By roomsDropDown = By.id("qf-0q-rooms");
            private By adultsDropDown = By.id("qf-0q-room-0-adults");
            private By childrenDropDown = By.id("qf-0q-room-0-children");
            private By childrenOneDropDown = By.id("qf-0q-room-0-child-0-age");
            private By childrenTwoDropDown = By.id("qf-0q-room-0-child-1-age");
            private By searchButton = By.xpath("//*[@id=\"hds-marquee\"]/div[3]/div[1]/div/form/div[5]/button");






            public void clickOnDestinationTextField() {
                clickOn(destinationTextField);
            }

            public void typeLocationInTheTextField(String text) {
                setValue(destinationTextField, text);
            }

            public void selectingFromTheAutoSuggestion(String expectDestination) throws InterruptedException{
                autoComplete(listOfCities, expectDestination);
                Thread.sleep(3000);
            }

            public void clickOnCheckInDate() {
                clickOn(checkInDate);
            }

            public void selectDateFromCheckIn(int date) throws InterruptedException{
                selectAnyDate(date);
                Thread.sleep(3000);
            }


            public void clickOnCheckOutDate() {
                clickOn(checkOutDate);
            }

            public void selectDateFromCheckOutDate(int date) throws InterruptedException{
                selectAnyDate(date);
                Thread.sleep(3000);
            }

            public void verifyNightsSelected(String text) throws InterruptedException{
                assertionPage.verifyTextMessage(numberOfNightsDisplayed, text);
                Thread.sleep(3000);
            }



            public void selectingFromFirstDropDown(int value) throws InterruptedException{
                selectFromDropDown(roomsAndAdultsDropDown, value);
                Thread.sleep(2000);
            }


            public void selectFromRoomDropDown(int number) throws InterruptedException {
                selectFromDropDown(roomsDropDown, number);
            }

            public void selectFromAdultDropDown(int number) throws InterruptedException{
                selectFromDropDown(adultsDropDown, number);
                Thread.sleep(2000);
            }


            public void selectFromChildrenDropDown(int number) throws InterruptedException{
                selectFromDropDown(childrenDropDown, number);
                Thread.sleep(2000);
            }

            public void selectingForthDropDown(int number) throws InterruptedException{
                selectFromDropDown(childrenOneDropDown, number);
                Thread.sleep(2000);
            }

            public void selectingFifthDropDown(int number) throws InterruptedException{
                selectFromDropDown(childrenTwoDropDown, number);
                Thread.sleep(2000);
            }

            public void clickOnSearchButton() throws InterruptedException{
                clickOn(searchButton);
                Thread.sleep(3000);
            }
}
