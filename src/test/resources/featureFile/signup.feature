Feature: Demo signup functionality

  Scenario: verify the signup with valid data
    Given user is at signup page
    When user enter the name and email
    And click on signup Button
    Then user navigated to th information page
