
/*
 * "Test Class" SHOULD always be in the same package of the "Class under test", but in his specific "source folder".
 * Ex:
 * 
 *    TEST UNDER CLASS : org.junitexample.core.Example.class
 *    TEST CLASS       : org.junitexample.core.ExampleTest
 *    
 *    NAME CONVETION:
 *    IT CAN BE CHANGED but it's not usual, but the name convention (PATTERN) for "test classes" are:
 *    - start with "Test" - (Test*.java)
 *    - end with "Test" - (*Test.java)
 *    - end with "TestSuite" - (*TestSuite.java)
 *    
 *    So many of tool used it by default, and any class under this configuration will run.
 */
package org.junitexample.core;

import org.junit.Before;
import org.junit.Test;

public class ExampleTest {
    
    private Example test;

    @Before
    public void setUp(){
        test = new Example();
    }

    @Test
    public void test() {
        test.execute();
    }
}
