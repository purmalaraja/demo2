Feature: login into Application

Scenario Outline: validating login
Given Initialize the browser chrome
And Navigating to the "Qaclickacadamy" site
And click in the login and landing into the sign in page
When user enter <username> and <Password> and logs in
Then verify that user is succesfully logs in 
And close browsers
Examples:
| username                 | Password |
|purmalaraja@gmail.com     | Barca123$ |
|purmalaraja123@gmail.com  | Barca123$ |