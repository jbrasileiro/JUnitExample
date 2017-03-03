package org.junitexample.coffeetalk.ut.exceptions;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcpetionHandlerRuleTest {

    private ExcpetionHandler handler;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        handler = new ExcpetionHandler();
    }

    @Test
    public void testThrowException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("An exception.");
        handler.throwException();
    }
}
