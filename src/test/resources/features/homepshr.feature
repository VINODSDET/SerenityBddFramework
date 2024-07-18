Feature: Login functionality

  @Smoke
  Scenario: 01 - Verify login functionality
    Given User is on ORANGEHRM login page
    When User entered credentials
    Then User is on ORANGEHRM homepage