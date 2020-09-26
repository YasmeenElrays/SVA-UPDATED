Feature: LoginPage
  i want to check that user can register in SVA Website successfully
  Scenario: user login and registration
    Given user inside login page And Click on login icon
    When user enter Email , password And Click on login button
    Then User login successfully
    And  User Click on logout icon and enter Email,password to login with Classera
    Then User login with classera successfully
    When User logout & Click on Sign up link
    And User Fill the required data And click on SignUp Button
    Then user Enter successfully
    When User Click on Teacher registration link to register
    Then request is pending till admin approve