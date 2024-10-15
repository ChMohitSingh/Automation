Feature: Demo signup fuctionality

  Background: 
    Given user is at signuppages

  @single
  Scenario: Verify the signup with valid data
    When user enter the nameemail
      | name | email              |
      | yash | yash1151@gmail.com |
    And click on Button
    Then user to the page

  @multiple
  Scenario Outline: Verify the signup with multiple set of data
    When user input <fullname> and <emailid>
    And click onbutton
    Then user should naviagt to the  page with valid data

    Examples: 
      | fullname | emailid            |
      | mohit    | y1@gmail.com       |
      | yash     | yash2212@gmail.com |
      | abhishek | abhiy3@gmail.com   |
      | abcdef   | y4@gmail.com       |