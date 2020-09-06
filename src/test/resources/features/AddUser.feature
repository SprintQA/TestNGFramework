Feature: Add user feature testing

  Background: 
    Given user opens the website
    When user login with valid credential
    Then verify user is on homepage
    When user clicks on User tab under admin and user management menu
    Then verify user is on user listing page
    When user clicks on add button
    Then verify add user page is displayed

  Scenario: Verify user can able to add new user
    When user fill required details
    And click on save button
    Then verify user is on user listing page
    And verify success message is displayed

  @Mustafa
  Scenario: Verify error message for username less than 5 character
    When user enter username less than five char
    Then verify invalid user error message is dispalyed
