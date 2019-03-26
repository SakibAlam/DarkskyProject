@regression @yahoobellicon
  Feature: Yahoo Bell icon feature


    Background:
      Given I am on Yahoo home page


      @yahoobellicon-1
      Scenario: Print news from yahoo bell icon
        When I hover over the bellicon
        Then I print the news from bellicon