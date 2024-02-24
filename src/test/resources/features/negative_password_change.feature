Feature: Negative Password Change

  Scenario: User provides incorrect current password for changing the password
    Given the user is logged into their account
    And the user navigates to the password change page

    When the user attempts to change the password
    And provides an incorrect current password

    Then the system should reject the password change request
    And display an error message indicating the incorrect current password