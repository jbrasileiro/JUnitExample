package org.junitexample.coffeetalk.ut.exceptions;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcpetionHandlerTest {

    private ExcpetionHandler handler;

    @Before
    public void setUp() {
        handler = new ExcpetionHandler();
    }

    @Test
    public void testThrowException() {
        try {
            handler.throwException();
            fail("exception expected here.");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("An exception.", "An exception.");
        }
    }
}
