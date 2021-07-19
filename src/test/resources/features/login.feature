Feature: Logging into the Gmail Account

  @signin
  Scenario: user should be able to login
    Given user is at the login page of gmail
    When user tries to Log In using
      | j.kelly1786@gmail.com | Apassword123! |
    Then user should be logged in


