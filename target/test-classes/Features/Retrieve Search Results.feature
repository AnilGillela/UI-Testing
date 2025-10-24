Feature: Retrieve search results

  Scenario: Ensure search for "Sport in 2023" returns at least 4 results
    Given I am on the BBC Sport homepage
    When I search for "Sport in 2023"
    Then at least 4 relevant results should be displayed