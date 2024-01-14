Feature: Verification of SignInPage details

  @TestCaseKey=AOP-T2
  Scenario: Verify the username and password text fields are appearing correctly on SignInPage
    Given User navigates to the Login page
    When User successfully lands on SignInPage
    Then User should be able to view the username and password text fields on SignInPage

  @TestCaseKey=AOP-T3
  Scenario: Verify the Login button and New User buttons are appearing correctly on SignInPage
    Given User navigates to the Login page
    When User successfully lands on SignInPage
    Then User should be able to view the Login and New User buttons on SignInPage