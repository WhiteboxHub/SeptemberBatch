Feature: Test navigation for walmart Home Page

@FindStore
Scenario: Find Store
Given User is able to access Walmart and click store finder
When User enters zipcode and press enter
|94536|
|94555|
|94538|
Then User should navigate to store finder page
#|username|password|
#|ab@gmail.com|123|
#|cb@gmail.com|123|
#|ef@gmail.com|123|

@SearchItems
Scenario: Search Items
Given User is able to access Walmart Home Page
When User enters search item and clicks search
|laptops|
|watches|
Then User should navigate search result page
#|key1|key2|
#|value1|value2|

@NavigateLinks 
Scenario Outline: User navigate to a particular page
Given User is able to access Walmart Home Page
When User click on "<HeaderLink>" link
Then User should navigate to "<LinkedWindow>" window

Examples:
|HeaderLink|LinkedWindow|
|PickupToday|PickupWindow|
|GroceryPickUp|GroceryWindow|
|WeeklyAds|WeeklyAdWindow|








