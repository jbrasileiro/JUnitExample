package org.junitexample.core;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void test() {
//        test.execute();
        System.err.println( ExampleTest.factorial(3));
    }
    private static int factorial(final int n){
        if(n > 1){
            return n * factorial(n - 1);
        } else{
            return n;
        }
    }
}
