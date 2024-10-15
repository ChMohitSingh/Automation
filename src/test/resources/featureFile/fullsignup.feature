Feature: Demo signup functionality

  #@single
  #Scenario: verify the signup with valid data
  #Given user is at signup page
  #When user enter the name and email
  #And click on signup Button
  #Then user navigated to th information page
  # @multiple
  Scenario Outline: Verify the signup with multiple set of data
    Given user
    When user input the <fullname> and <emailid>
    And click on button
    Then user should navigte to the information page with valid data

    Examples: 
      | fullname | emailid     |
      | abc      | rajesh.@com |
      | xyz      | abc@.in     |
      | mohit    | xyz.in      |
