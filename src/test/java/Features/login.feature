Feature: Login
  The feature presents login functionality

  Scenario: Login with existent username and password
    Given I navigate to login page
    And I enter email="al.au.myedu@gmail.com", password="?tCu7eYq#A#fK6!"
    And I click login button
    Then I should see Job Search page