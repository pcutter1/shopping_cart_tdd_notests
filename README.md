# ent-tdd-shopping-cart BASIC

You have been hired as a developer at Ali Snobba - a snobby online store where customers purchase high-end merchandise like Louis Vuitton handbags and Rolex watches.

Your job is to implement a shopping cart that stores items while customers are in the process of ordering. Since Ali Snobba is a small company with only one server, you don't need to store the items in Redis or a database - you can keep them in memory.

You also don't need to worry about authentication or session tracking. You can assume that Ali Snobba's infrastructure will handle this for you.


## TODO
Implement code to satisfy the acceptance criteria below.  There are tests for all requirements in the file CartTest.java 
in the test tree.  You can uncomment them, or, if you are more comfortable, you can test with the main method in App.java.

## User Story:

- As a shopper
- I want to have a shopping cart
- So that I can store items until I am ready to checkout

## Acceptance Criteria:

1. Given that I visit the site, when I begin shopping, then I expect my cart to be empty.
1. Given I have an empty cart, when I add an Item, then I expect to `getTotalPrice()` reflect the sum of all the Items in my cart.
1. Given I have an empty cart, when I add items, then I expect `itemizedList()` reflect the items I have added along with their price. iven I have an empty cart, when I add more than one of an item, then I expect `getTotalPrice()` to reflect both the item price and quantity.
1. Given I have an empty cart, when I add more than one of an item, then I expect `itemQuantities()` to show the number of items I have added.
1. Given I have a cart with items that are not on sale, when I add items that are on sale, I expect `onSaleItems()` to include only the items on sale.

## Additional Resources
- [Working with Currency](http://vanillajava.blogspot.de/2011/08/double-your-money-again.html)
- [String.format](https://dzone.com/articles/java-string-format-examples)
 
