@regression @amazonSignUp
  Feature: Amazon Sign Up feature


    Background:
      Given I am on Amazon home page


      @amazonSignUp-1
      Scenario: Verify Short Password Invalid Sign Up
        When I hover over Accounts & lists
        And I click on Start here
        And I enter hello in the yourname text field
        And I enter hello@yahoo.com in the email text field
        And I enter 1234 in the password text field
        And I enter 1234 in the reenterpassword text field
        And I click on create your amazon account
        Then I verify short password error message

       @amazonSignUp-2
       Scenario: Verify Wrong Email Invalid Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I enter hello in the yourname text field
         And I enter hello in the email text field
         And I enter 123456 in the password text field
         And I enter 123456 in the reenterpassword text field
         And I click on create your amazon account
         Then I verify invalid email error message

       @amazonSignUp-3
       Scenario: Verify Password No Match Invalid Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I enter hello in the yourname text field
         And I enter hello@yahoo.com in the email text field
         And I enter 123456 in the password text field
         And I enter 654321 in the reenterpassword text field
         And I click on create your amazon account
         Then I verify password must match error message

       @amazonSignUp-4
       Scenario: Verify Name Blank Invalid Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I put  in the yourname text field
         And I enter hello in the email text field
         And I enter 123456 in the password text field
         And I enter 123456 in the reenterpassword text field
         And I click on create your amazon account
         Then I verify name missing error message

       @amazonSignUp-5
       Scenario: Verify Email Blank Invalid Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I enter hello in the yourname text field
         And I put in the email text field
         And I enter 123456 in the password text field
         And I enter 123456 in the reenterpassword text field
         And I click on create your amazon account
         Then I verify email missing error message

       @amazonSignUp-6
       Scenario: Verify Password Blank Invalid Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I enter hello in the yourname text field
         And I enter hello@yahoo.com in the email text field
         And I put  in the password text field
         And I enter 123456 in the reenterpassword text field
         And I click on create your amazon account
         Then I verify password missing error message

       @amazonSignUp-7
       Scenario: Verify Invalid Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I enter hello in the yourname text field
         And I enter hello@yahoo.com in the email text field
         And I enter 123456 in the password text field
         And I put  in the reenterpassword text field
         And I click on create your amazon account
         Then I verify reenter password missing error message

       @amazonSignUp-8
       Scenario: Verify All Empty Fields Sign Up
         When I hover over Accounts & lists
         And I click on Start here
         And I put  in the yourname text field
         And I put  in the email text field
         And I put  in the password text field
         And I put  in the reenterpassword text field
         And I click on create your amazon account
         Then I verify leaving all fields empty error message


