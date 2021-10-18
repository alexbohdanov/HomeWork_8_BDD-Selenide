#Language: ru

Feature: create expense request
  Background:
    Given I am authorized

    Scenario Outline:
      Given I hover expenses menu
      And I click all expenses button
      And I click create expense button
      When I fill field expense appointment with '<name>'
      And I select business unit
      And I select expenditure
      And I select currency
      And I fill sum plan
      And I fill data
      And I click save and close button
      Then I can see success message

      Examples:
      | name |
      | test |
      | test1 |

