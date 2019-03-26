@regression @darkskysignup
Feature: Singing up on Darksky Website then going to gmail and verifying

  Background:
    Given I am on Darksky home page


      @darkskysingup-1
      Scenario: Singing up on darksky website then going to gmail and verifying
        When I click on darkskyapi link
        When I click on sign up button
        When I enter email address on the email text field
        When I enter password in the password text field on darksky
        When I re enter my password on the password text field
        When I click on register button

