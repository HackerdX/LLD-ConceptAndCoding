# DECORATOR PATTERN:
YT => https://www.youtube.com/watch?v=w6a9MXUwcfY&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=6&ab_channel=Concept%26%26Coding

## PROBLEM STATEMENT:
1) Suppose you have a base pizza that can be like Veggie Delight, Margherita, FarmHouse etc.
2) And we can add some more topping on this base of pizza like Mushroom, Extra Cheese, Jalapeño and so on.
3) Now everytime I get to add one topping into list, there can be many permutations and combinations for classes that can be made here
4) for example: Veggie Delight + Mushroom + Extra Cheese can ba one class, Margherita + Mushroom can be another choice, etc.
5) That means adding a topping can have 2^n combination of classes which is a overload.

## SOLUTION:
1) Create an abstract class BasePizza (can be an interface also depends on use case), which has cost to be returned by each base of pizza.
2) Extend that BasePizza with VeggieDelight, FarmHouse, Margherita concrete class, which will return the cost of each particular base pizza.
3) Create a ToppingDecorator abstract class (can be an interface also), which extends BasePizza (IS-A Relationship)
4) Why extend base pizza? As we need to ass the cost on top of that base pizza, that's why.
5) Now Every topping class, example ExtraCheese, Mushroom or Jalapeño concrete class, can have an object of base pizza class (HAS-A Relationship with Base class) and return the cost with the base pizza + its own cost.

## HOW ITS DIFFERENT FROM BUILDER PATTERN:
1) This behaviour is same like builder pattern, but the difference is, if we need to add any Base Pizza or Toppings, in decorator pattern, we can extend the class (or implement interface) and create its own usage (Singleton is also fulfilled).
2) But in builder pattern, once the builder is build, and if any addition comes, we need to again make changes to that builder class, which is violation of OCP.

## WHEN TO USE BUILDER OR DECORATOR:
1) Builder Pattern: Use when you want to construct a complex object with a step-by-step approach, and you need to control the construction process.
2) Decorator Pattern: Use when you want to add or modify the behavior of objects dynamically at runtime without altering their structure.
3) In some cases, you might find them used together. For example, you might use a Builder to construct a basic object and then use Decorators to add additional features 

## CHATGPT ABOUT WHAT TO BE USED WHEN 😎