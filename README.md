# Test Factorial

unit testing and JUnit 5 


1.  `factorial` method in
the [Factorial](src/main/java/com/epam/rd/autotasks/Factorial.java) class. Here are some details:

- the method takes a String as a parameter, transforms it to an integer value and counts its factorial.
- The method returns a result as a String.
- String parameter `n` must represent a non-negative integer number. If it does not, throw an IllegalArgumentException.

2. Test classes:

- [FactorialBadInputTesting](src/main/java/com/epam/rd/autotasks/FactorialBadInputTesting.java)\
  There are four empty methods that you must complete:
    - `testNullInput` - test a null input cases
    - `testNegativeInput` - test a negative number input cases
    - `testFractionalInput` - test a fractional cases
    - `testNonDigitalInput` - test a non-digit cases
- [FactorialCsvParametrizedTesting](src/main/java/com/epam/rd/autotasks/FactorialCsvParametrizedTesting.java)\
  it is a parameterized test, that takes arguments from the [csvCases.csv](src/main/resources/csvCases.csv) file. 
- [FactorialMethodSourceParametrizedTesting](src/main/java/com/epam/rd/autotasks/FactorialMethodSourceParametrizedTesting.java)\
  it is a parameterized test, that takes arguments from the `testCases` method.
    - "1", "1"
    - "2", "2"
    - "5", "120"
- [FactorialRegularInputTesting](src/main/java/com/epam/rd/autotasks/FactorialRegularInputTesting.java)\
  it is a test class where you can add regular test cases. 

- [FactorialTestingsTest](src/test/java/com/epam/rd/autotasks/FactorialTestingsTest.java)
- [LazyFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/LazyFactorialTestingsTest.java)
- [WrongOperationConcatIntFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/WrongOperationConcatIntFactorialTestingsTest.java)
- [WrongOperationSumIntFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/WrongOperationSumIntFactorialTestingsTest.java)

