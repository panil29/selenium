Feature: Application Login

Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with "anil" and password "1234"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with "pavuluru" and password "1234"
Then Home page is populated
And Cards displayed are "false"
