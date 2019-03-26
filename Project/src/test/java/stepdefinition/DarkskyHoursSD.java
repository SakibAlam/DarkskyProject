package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AssertionPage;
import framework.BasePage;
import framework.darksky.DarkSkyHome;

public class DarkskyHoursSD {

    DarkSkyHome darkskyHome = new DarkSkyHome();
    AssertionPage assertionPage = new AssertionPage();
    BasePage basePage = new BasePage();


    @Then("^I verify both list same$")
    public void verifyBothListSame() {
        assertionPage.verifyTwoLists(darkskyHome.expectedAllHoursList(), basePage.getTextFromElements(darkskyHome.hoursOnWebsite));
        System.out.println(basePage.getTextFromElements(darkskyHome.hoursOnWebsite));
        System.out.println(darkskyHome.expectedAllHoursList());

    }
}
