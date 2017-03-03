#04-Parameterized Test & Theories

#Parameterized Test

* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/simple/EmailValidatorPTest.java)

![alt tag](/MD/coffee-talk/img/result-parametrized-test.png)

#Theory

* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/simple/EmailValidatorPTest.java)
* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/theory/TheoryTest.java)
![alt tag](/MD/coffee-talk/img/result-theory-test.png)

# Usage

Theory class is generally easier;
No need fields or a constructor. 
Intended to be more expressive of the tester's goals;
Original paper proposed theories called them as "specifications that catch bugs."

You should have noticed, however, that there is no means of pairing a specific result with a specific data point.
You should use theories when you can express in the form of an assertion the general relationship between a data point and an expected result, and when that relationship will hold true for all data.

Large set of inputs with varying results, then, you will still need to write parameterized tests.
Parameterized tests give the you greater flexibility as an author, but the semantics of the test are usually implicit.


#Exception

## Classic way
* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/exceptions/ExcpetionHandlerTest.java)

## Annotation
* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/exceptions/ExcpetionHandlerAnnotationTest.java)

## Rule
* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/exceptions/ExcpetionHandlerRuleTest.java)