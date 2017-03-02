package org.junitexample.coffeetalk.ut.depedency;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidatorImpTest {

    @Test
    public void testPasswordValidatorImp() {
        PasswordValidator passwordValidator = new PasswordValidatorT(true);
        List<PasswordValidator> validators = Arrays.asList(passwordValidator);
        PasswordValidatorImp validator = new PasswordValidatorImp(validators);
        Assert.assertTrue(validator.validate(""));
    }

    @Test(
        expected = IllegalStateException.class)
    public void testPasswordValidatorImpFalse() {
        PasswordValidator passwordValidator = new PasswordValidatorT(false);
        List<PasswordValidator> validators = Arrays.asList(passwordValidator);
        PasswordValidatorImp validator = new PasswordValidatorImp(validators);
        validator.validate("");
        Assert.fail();
    }
}

class PasswordValidatorT
    implements
    PasswordValidator {

    private final boolean value;

    public PasswordValidatorT(
        final boolean value) {
        super();
        this.value = value;
    }

    @Override
    public boolean validate(
        final String password) {
        return value;
    }
}
