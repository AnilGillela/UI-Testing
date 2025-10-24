Feature: Validation in a table of results

  Scenario: Verify top 3 finishers of the 2023 Las Vegas Grand Prix
    Given I am on the BBC Sport homepage
    When I navigate to the Formula 1 Las Vegas Grand Prix 2023 results page
    Then I should see "Max Verstappen" in first place
    And I should see "George Russell" in second place
    And I should see "Sergio Perez" in third place