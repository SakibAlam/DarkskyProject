@regression @messengerlogin
  Feature: Messenger log in feature


    Background:
      Given I am on Messenger home page


      @messengerlogin-1
      Scenario: Verify Invalid Messenger Login
        When I enter  mohammad@technosoft.io into username field on messenger page
        And I enter  test1234 into password field on messenger page
        And I click on sign up button on messenger page
        Then I verify invalid login error message