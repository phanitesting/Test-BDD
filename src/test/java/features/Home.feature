@home
Feature: Validating the Home Page
  @smoke
  Scenario: Check whether user is able to open the application
    Given user opens the browser
    When launch the application
    Then Application should launch successfully
  @regresssion
  Scenario: Check whether contents displaying in the category section
    Given user opens the browser
    When launch the application
    Then observe the contents in the category section
      | Phones | Laptops | Monitors |
  @regresssion
  Scenario Outline: Check the login functionlaity
    Given user opens the browser
    When launch the application
    And clicks on login link
    And enter "<username>" "<password>" and click on login button
    Then user should logins successfully

    Examples: 
      | username | password |
      | demo     | demo     |
      | demo1    | demo123  |
