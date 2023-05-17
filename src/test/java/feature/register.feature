Feature: registration
  @register
  Scenario: as a user i should able to register successfully so that I can use all user features
    Given I am on registration page
    When I should required registration details
    Then I should able to register successfully

