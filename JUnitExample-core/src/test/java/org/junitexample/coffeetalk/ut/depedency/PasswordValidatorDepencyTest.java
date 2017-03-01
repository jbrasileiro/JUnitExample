package org.junitexample.coffeetalk.ut.depedency;

import org.junit.Assert;
import org.junit.Test;
import org.junitexample.coffeetalk.ut.simple.EmailValidator;

public class PasswordValidatorDepencyTest {

    private PasswordValidatorDepency validator;

    @Test
    public void testValidate() {
        EmailValidator emailValidator = new EmailValidatorT(false);
        SequenceValidator sequenceValidator = new SequenceValidatorT(false);
        BirthdayValidator birthdayValidator = new BirthdayValidatorT(false);
        validator
            = new PasswordValidatorDepency(emailValidator, sequenceValidator, birthdayValidator);
        Assert.assertTrue(validator.validate(""));
    }
}

class EmailValidatorT
    extends
    EmailValidator {

    private final boolean value;

    public EmailValidatorT(
        final boolean value) {
        super();
        this.value = value;
    }

    @Override
    public boolean isValid(
        final String email) {
        return this.value;
    }
}

class SequenceValidatorT
    extends
    ValidatorT
    implements
    SequenceValidator {

    public SequenceValidatorT(
        final boolean value) {
        super(value);
    }
}

class BirthdayValidatorT
    extends
    ValidatorT
    implements
    BirthdayValidator {

    public BirthdayValidatorT(
        final boolean value) {
        super(value);
    }
}

abstract class ValidatorT
    implements
    PasswordValidator {

    private final boolean value;

    public ValidatorT(
        final boolean value) {
        super();
        this.value = value;
    }

    public boolean validate(
        final String password) {
        return value;
    }
}
