@smoke
Feature: F01_Login |


  Scenario: user login with standard_user
    Given user link swag-labs page
    When user enter valid username "standard_user"
    And enter password "secret_sauce"
    And Click on login button.
    Then Validate that user login successfully.

  Scenario: login with locked out user
    Given user link swag-labs page
    When user enter name "locked_out_user"
    And user enter pass "secret_sauce"
    And Click on login button.
    Then Validate that user locked out displayed successfully.

  Scenario: login with problem_user
    Given user link swag-labs page
    When user enter username "problem_user"
    And user enter password "secret_sauce"
    And Click on login button.
    Then Validate that the user logged in successfully.
