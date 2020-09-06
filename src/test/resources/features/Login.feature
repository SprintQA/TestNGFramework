Feature: This feature we created to test all login fuctionality
  Developer - Vildan
  Tester - Chirag

  Background: 
    Given user opens the website

  @Smoke @Chirag
  Scenario: Verify login successful for valid cred
    When user login with valid credential
    Then verify user is on homepage

  @Regression @Davy
  Scenario: Verify login unsuccessful for valid cred
    When user login with invalid credential
    Then verify invalid login error message is displayed
