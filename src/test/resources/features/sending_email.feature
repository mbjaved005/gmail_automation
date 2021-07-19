Feature: Sending an email to the same account

  @sending_email
  Scenario: user should be able to send the email
    Given user is on the inbox page
    When user sends an email using
      | j.kelly1786@gmail.com | A Subject | Something |
    Then the email should be sent