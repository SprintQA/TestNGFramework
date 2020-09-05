Feature: This feature we created to test all login fuctionality
  Developer - Vildan
  Tester - Chirag

  Scenario: Verify login successful for valid cred
    Given user opens the website
    When user login with valid credential
    Then verify user is on homepage

  Scenario: Verify login unsuccessful for valid cred
    Given user opens the website
    When user login with invalid credential
    Then verify invalid login error message is displayed
