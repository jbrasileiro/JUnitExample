#GET STARTED

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