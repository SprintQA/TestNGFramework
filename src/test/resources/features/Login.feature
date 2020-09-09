Feature: This feature we created to test all login fuctionality
  Developer - Vildan
  Tester - Chirag

  Background: 
    Given user opens the website

  @Smoke
  Scenario: Verify login successful for valid cred
    When user login with valid credential
    Then verify user is on homepage

  @Regression @Chirag
  Scenario: Verify login unsuccessful for valid cred
    When user login with invalid credential
    Then verify invalid login error message is displayed

  @Regression @Chirag
  Scenario: Verify login unsuccessful for valid cred
    When user login with invalid credential
    Then fail me

  @Regression @Chirag
  Scenario: Verify login unsuccessful for valid cred
    When user login with invalid credential
    Then fail me

