Feature: emailAFriend
  @emailAFriend
  Scenario: As a user, I should able to refer a product to friend via email successfully


    Given I am on registration page
    And I enter required registration details without timestamp
    And I am on login page
    And I enter valid email id and password
    And I click on Apple Mac Book Pro 13Inch
    And I click email a friend
    When I enter friend's email id and message
    Then I should email a friend successfully