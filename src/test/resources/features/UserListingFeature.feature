Feature: Add user feature testing

  Background: 
    Given user opens the website
    When user login with username "admin.username" and password "admin.password"
    Then verify user is on homepage
    When user clicks on User tab under admin and user management menu
    Then verify user is on user listing page

  @datatable
  Scenario: verify data on user listing page
    And verify user data on user listing pages with header
      | Username               | UserRole | EmployeeName             | Status  |
      | Admin                  | Admin    | Linda Anderson           | Enabled |
      | annah                  | ESS      | Anna Hamilton            | Enabled |
      | f.grace1               | ESS      | Fiona Grace              | Enabled |
      | fiona.grace            | ESS      | Fiona Grace              | Enabled |
      | hannah.flores          | ESS      | Hannah Flores            | Enabled |
      | jasmine.morgan         | ESS      | Jasmine Morgan           | Enabled |
      | kevin                  | ESS      | Kevin Mathews            | Enabled |
      | robert.craig           | ESS      | Robert Craig             | Enabled |
      | russel.hamilton        | ESS      | Russel Hamilton          | Enabled |
      | steven.edwards         | ESS      | Steven Edwards           | Enabled |
      | Swapnil.kabmble@ms.com | ESS      | Swapnil Dhananjay Kamble | Enabled |
      | thomas.fleming         | ESS      | Thomas Fleming           | Enabled |
