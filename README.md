# Static Methods

#### Objective: 

Understand the difference between static and instance methods in Java. Be able to create and use static methods to perform operations that do not require an instance of a class.

#### Time Required: 20 minutes

#### Difficulty: Beginner

#### Scenario: 

You have been asked to create a utility class that contains methods to perform some common calculations. These calculations do not require any object state, so you decide to make them static methods.

#### Task:

#### Create a class called CalculatorUtils.

* Add a static method called add() that takes two int parameters and returns their sum.
* Add a static method called subtract() that takes two int parameters and returns their difference.
* Add a static method called multiply() that takes two int parameters and returns their product.
* Add a static method called divide() that takes two int parameters and returns their quotient.
* Test all the static methods by calling them using the class name.

#### Sample Output

System.out.println(CalculatorUtils.add(2, 3)); // 5 <br>
System.out.println(CalculatorUtils.subtract(5,3));//2 <br>
