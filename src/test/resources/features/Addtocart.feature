Feature: Verify Add to cart Functionality

Scenario: User clicks Add to cart
Given user searches for a product 
When user clicks on search button
And user applies filters to the product
And user clicks on add to cart button
Then product should be added to cart successfully
