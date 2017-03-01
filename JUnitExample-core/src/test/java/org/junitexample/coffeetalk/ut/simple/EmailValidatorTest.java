package org.junitexample.coffeetalk.ut.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmailValidatorTest {

    private EmailValidator validator;

    @Before
    public void setUp() {
        validator = new EmailValidator();
    }

    @Test(
        expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenValueIsNull() {
        Assert.assertTrue(validator.isValid(null));
    }
    
    @Test
    public void shouldReturnFalseWhenBlank() {
        Assert.assertFalse(validator.isValid(""));
    }
    
    @Test
    public void shouldReturnTrueWhenValidaEmail() {
        Assert.assertTrue(validator.isValid("joao.almeida@cwi.com.br"));
    }
}
