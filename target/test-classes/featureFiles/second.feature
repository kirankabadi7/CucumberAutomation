@AllTests
Feature: Application login

  Background: 
    Given user is on Netbanking login page

  @Smoke @NetBanking
  Scenario: Admin page default login
    When user login into the applciation with username "admin" and password "xyz"
    Then home page is displayed
    And cards are dispalyed

  @Smoke @Mortgage
  Scenario Outline: Multiple user page default login
    When user login into the applciation with username "<un>" and password "<pwd>"
    Then home page is displayed
    And cards are dispalyed

    Examples: 
      | un  | pwd  |
      | un1 | ancb |
      | un2 | asww |