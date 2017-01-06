package org.junitexample.core.one;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonInstantiatableTest {

    private NonInstantiatable test;

    @Before
    public void setUp() {
        test = new NonInstantiatable();
    }

    /*
     * This test will fail
     */
    @Test
    public void test() {
        Assert.assertTrue(test.canReach());
        fail("Test is expected to fail.");
    }
}
