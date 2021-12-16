Feature: Free CRM login Feature

#without Examples Keyword
#Scenario: Free CRM Login Test SCenario

#Given User is already on Login page
#When Title of login page is free CRM
#Then User enters username  and Password
#Then User enters "gundpratiksha@gmail.com"  and "Pratiksh@2"
#And user clicks on login Button
#Then user is on home page
#Then Close the browsers

# with Examples Keyword 
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login page
When Title of login page is free CRM
Then User enters "<username>"  and "<password>"
And user clicks on login Button
Then user is on home page
#Then Close the browsers

Examples:
| username | password |
| naveenk  | test@123 |
| tom     | test456  | 
| gundpratiksha@gmail.com | Pratiksh@2 |	