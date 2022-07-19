Feature: Login into application

Scenario Outline: Positive test validating login

Given Intialize the browser with chrome
And Navigate to "https://qaclickacademy.com/" Site
And Click on login link in home page to land on Secure sign in page
When user enters <username> and <password> and logs in
Then verify that user is succesfully logged in
And close browsers
Examples:
|username	            |password	    |
|panil2996@gmail.com	|Midhun-1994	|
|test99@gmail.com		|123456			|