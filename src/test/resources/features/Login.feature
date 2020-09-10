Feature: This feature we created to test all login fuctionality
  Developer - Vildan
  Tester - Chirag

  Background: 
    Given user opens the website

  @Smoke1
  Scenario Outline: Verify login successful for valid user
    When user login with username "<username>" and password "<password>"
    Then verify user is on homepage

    Examples: 
      | username        | password        |
      | admin.username  | admin.password  |
      | normal.username | normal.password |

  @Smoke
  Scenario Outline: Verify login unsuccessful for invalid cred
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples: 
      | username         | password         |
      | invalid.username | admin.password   |
      | admin.username   | invalid.password |
      | invalid.username | invalid.password |
