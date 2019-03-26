$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darkskyhomepage.feature");
formatter.feature({
  "line": 2,
  "name": "Darksky click on time machine button",
  "description": "",
  "id": "darksky-click-on-time-machine-button",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@darkskyhomepage"
    }
  ]
});
formatter.before({
  "duration": 6167701860,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkskyTimeMachineSD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 320303417,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify todays date from time machine button",
  "description": "",
  "id": "darksky-click-on-time-machine-button;verify-todays-date-from-time-machine-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@darkskyhomepage-1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click on time machine button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify today\u0027s date is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskyTimeMachineSD.clickOnTimeMachine()"
});
formatter.result({
  "duration": 5412157636,
  "status": "passed"
});
formatter.match({
  "location": "DarkskyTimeMachineSD.verifyTodayDateSelected()"
});
formatter.result({
  "duration": 39757576,
  "status": "passed"
});
formatter.after({
  "duration": 147988580,
  "status": "passed"
});
formatter.before({
  "duration": 4418137622,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkskyTimeMachineSD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 14417857,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "darksky-click-on-time-machine-button;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@darkskyhomepage-2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I expand today\u0027s timeline",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I verify lowest and highest temperature is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkyTemperatureSD.expandTodaysTimeline()"
});
formatter.result({
  "duration": 5343207846,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyTemperatureSD.verifyLowestHighest()"
});
formatter.result({
  "duration": 198704968,
  "status": "passed"
});
formatter.after({
  "duration": 149070999,
  "status": "passed"
});
formatter.before({
  "duration": 4249191945,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkskyTimeMachineSD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 10522830,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify if hours are every two hour",
  "description": "",
  "id": "darksky-click-on-time-machine-button;verify-if-hours-are-every-two-hour",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@darkskyhomepage-3"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I verify both list same",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskyHoursSD.verifyBothListSame()"
});
formatter.result({
  "duration": 380091143,
  "status": "passed"
});
formatter.after({
  "duration": 126703164,
  "status": "passed"
});
formatter.before({
  "duration": 3842545814,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkskyTimeMachineSD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 10248885,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline",
  "description": "",
  "id": "darksky-click-on-time-machine-button;verify-current-temperature-should-not-be-greater-or-less-than-the-temperature-from-daily-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@darkskyhomepage-4"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I verify current temp is not greater or less then temps from daily timeline",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskyCurrenttemperatureSD.verifyCurrentTemp()"
});
formatter.result({
  "duration": 361189151,
  "status": "passed"
});
formatter.after({
  "duration": 124681424,
  "status": "passed"
});
});