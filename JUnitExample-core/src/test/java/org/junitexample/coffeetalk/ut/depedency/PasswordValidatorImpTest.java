package org.junitexample.coffeetalk.ut.depedency;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidatorImpTest {

    @Test
    public void testPasswordValidatorImp() {
        PasswordValidator passwordValidator = new PasswordValidator() {

            @Override
            public boolean validate(
                final String password) {
                return true;
            }
        };
        List<PasswordValidator> validators = Arrays.asList(passwordValidator);
        PasswordValidatorImp validator = new PasswordValidatorImp(validators);
        Assert.assertTrue(validator.validate(""));
    }

}
