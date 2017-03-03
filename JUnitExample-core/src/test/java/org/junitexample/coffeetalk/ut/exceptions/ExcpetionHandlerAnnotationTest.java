package org.junitexample.coffeetalk.ut.exceptions;

import org.junit.Before;
import org.junit.Test;

public class ExcpetionHandlerAnnotationTest {

    private ExcpetionHandler handler;

    @Before
    public void setUp() {
        handler = new ExcpetionHandler();
    }

    @Test(
        expected = IllegalArgumentException.class)
    public void testThrowException() {
        handler.throwException();
    }
}
