Feature: Find nearest location
@login
Scenario: Find Store
Given User is able to access Walmart and click store finder
When User enters zipcode and press enter
|zipcode|
|94536|
|94555|
|94538|
Then User should navigate to store finder page
#|username|password|
#|ab@gmail.com|123|
#|cb@gmail.com|123|
#|ef@gmail.com|123|

Scenario Outline: Find Store with Options
Given User is able to access Walmart and click store finder
When User select "<finderoption>" and press enter
Then User should navigate to store finder page

Examples:
|finderoption|
|StoreFinder|
|LocalStore|




