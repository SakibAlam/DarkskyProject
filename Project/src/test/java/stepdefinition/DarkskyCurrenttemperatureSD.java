package stepdefinition;

import cucumber.api.java.en.Then;
import framework.darksky.DarkSkyHome;

public class DarkskyCurrenttemperatureSD {


    DarkSkyHome darkSkyHome = new DarkSkyHome();


    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTemp() {
        darkSkyHome.verifyCurrentTemp();
    }
}
