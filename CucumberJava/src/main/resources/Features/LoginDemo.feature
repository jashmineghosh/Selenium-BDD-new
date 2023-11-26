Feature: Test login functionality

#  Scenario Outline: Check login is successful with valid credentials
#    Given browser is open
#    And user is on login page
#    When user enters <username> and <password>
#    And user clicks on login
#    Then user is navigated to the home page
#
#    Examples:
#      | username      | password     |
#      | standard_user | secret_sauce |

  Scenario: Check login with test data generator
    Given browser is open from faker
    And user is on login page from faker
    When user enters info on login page
    And user clicks on login from faker
#    Then user is navigated to the home page