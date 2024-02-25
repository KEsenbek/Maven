@payments
Feature: Product Search

  Background:
    Given a guest user visits the website


  Scenario: Basic Product Search
    Given the user enters a search query
    When the user initiates the search
    Then the search results are displayed