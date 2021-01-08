Feature: Google file

  Scenario: check Google search pages
    Given I open Google page
    When I enter Cheese Cake on search bar
    Then List of search results
