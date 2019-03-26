@regression @hotelsbooking
  Feature: Hotels booking feature


    Background:
      Given I am on Hotels home page


      @hotelsbooking-1
      Scenario: Verify booking on hotels website
        When I click on the searchField
        And I type Bora Bora in the text field
        And I choose Bora Bora, French Polynesia from the result
        And I click on the checkInButton
        And I select 1 day from today's date
        And I click on the checkoutButton
        And I select 8 day from today's date
        And I verify it says 7 days on the side
        And I click on 2 dropdown menu
        And I select 0 from dropdown rooms menu
        And I select 1 from dropdown adults menu
        And I select 2 from dropdown children menu
        And I select age as 3 from the first children dropdown
        And I select age as 2 from the second children dropdown
        And I click on the searchButton
        Then I verify the result text on the next page





