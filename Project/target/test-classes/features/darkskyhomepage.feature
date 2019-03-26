@regression @darkskyhomepage
  Feature: Darksky click on time machine button

    Background:
      Given I am on Darksky home page


      @darkskyhomepage-1
      Scenario: Verify todays date from time machine button
        When I click on time machine button
        Then I verify today's date is selected


      @darkskyhomepage-2
      Scenario: Verify individual day temp timeline
        When I expand today's timeline
        Then I verify lowest and highest temperature is displayed correctly

      @darkskyhomepage-3
      Scenario: Verify if hours are every two hour
        Then I verify both list same


      @darkskyhomepage-4
      Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
        Then I verify current temp is not greater or less then temps from daily timeline