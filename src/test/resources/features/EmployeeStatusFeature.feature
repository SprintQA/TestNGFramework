Feature: Add user feature testing

  Background: 
    Given user opens the website
    When user login with username "admin.username" and password "admin.password"
    Then verify user is on homepage

  @datatable
  Scenario: verify data on user listing page
    When user clicks on Employee status tab under admin and job menu
    Then verify user is on employee status page
    And verify employee status data
      | Job Title            |
      | Freelance            |
      | Full-Time Contractss |
      | Full-Time Permanent  |
      | Full-Time Probation  |
      | Part-Time Contract   |
      | Part-Time Internship |
      | test                 |

  @datatable1
  Scenario: verify data on user listing page
    When user clicks on Job title tab under admin and job menu
    Then verify user is on job titles page
    And verify job title data
      | Account Clerk   |
      | CEO             |
      | Finance Manager |
      | HR Executive    |
      | HR Manager      |
      | IT Executive    |
      | IT Manager      |
      | Manger          |
      | Sales Executive |
      | Sales Manager   |
