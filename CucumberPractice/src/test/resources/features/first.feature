Feature: Search functionality
  As a user, I am adding a description here

  Background:
    Given the user is on the google page

  Scenario: User should be able to search
    Given user entered text
    When user click submit
    Then search results are displayed

  Scenario Outline: User should be able to search
    Given user entered "<message>"
    When user click submit
    Then search results are displayed
    Examples:
      | message |
      |    Ivana   |
      |   Luv    |