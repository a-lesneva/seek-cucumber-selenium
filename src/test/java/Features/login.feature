Feature: Login
  The feature presents login functionality

  Scenario: Login with existent username and password
    Given I navigate to login page
    And I login with email="al.au.myedu@gmail.com", password="?tCu7eYq#A#fK6!"
    Then I should see Job Search page


  Scenario: Login with empty username and password
    Given I navigate to login page
    And I login with email="", password=""
    Then I should see email error message "Invalid email address, use format example@domain.com" on login page
    And I should see password error message "Password can't be blank" on login page