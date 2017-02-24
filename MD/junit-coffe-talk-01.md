# COFFE TALK 01
## Content
### UT Scope (5min)
### Diference between UT(Unit test) & IT (Integration Test). (5min)
### Developing UT : legacy code & new code.(10min)
### Parameterized Test & Theories.(10min)

#1 - UT Scope
* Easy
* Unit Tests Should Be Atomic
* Order Independent and Isolated
* Runs Fast
##Example
** single
** subtype
** depedency


Atomic tests are order-independent, relying on and causing no side effects.
They neither rely on nor alter shared state; they do not mutate their environment.
If one legitimately fails because a bug has been introduced in the production code, it shouldn’t have a domino effect. 

http://blog.stevensanderson.com/2009/08/24/writing-great-unit-tests-best-and-worst-practises/
http://defragdev.com/blog/?p=714
https://zeroturnaround.com/rebellabs/dont-test-blindly-the-right-methods-for-unit-testing-your-java-apps/
https://developer.salesforce.com/page/How_to_Write_Good_Unit_Tests
http://stackoverflow.com/questions/2741832/unit-tests-vs-functional-tests
http://www.softwaretestinghelp.com/the-difference-between-unit-integration-and-functional-testing/


- [JUNIT CLASSES](/MD/junit-basic.md)

"Test Class" SHOULD always be in the same package of the "Class under test", but in his specific "source folder".

 |      | CLASS NAME                          | SOURCE FOLDER    |
 |------|------------------------------------ |------------------|
 | code | org.junitexample.core.Example.class | /src/main/java   |
 | test | org.junitexample.core.ExampleTest   | /src/test/java   |

   
#NAME CONVETION:
   IT CAN BE CHANGED but it's not usual, but the name convention (PATTERN) for "unit test classes" are:
   
   - start with "Test" - (Test*.java)
   
   - end with "Test" - (*Test.java)
   
   - end with "TestSuite" - (*TestSuite.java)
   
   So many of tool used it by default, and any class under this configuration will run.