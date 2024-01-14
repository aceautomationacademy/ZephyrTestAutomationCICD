Feature: Verification of RegistrationPage details

  @TestCaseKey=AOP-T4
  Scenario: Verify the new user registration landing page
    Given User navigates to the Login page
    When User successfully lands on RegistrationPage
    Then User should be able to view the Registration page heading

  @TestCaseKey=AOP-T5
  Scenario: Verify the new user registration page
    Given User navigates to the Login page
    When User successfully lands on RegistrationPage
    Then User should be able to enter the details of registration and submit registration