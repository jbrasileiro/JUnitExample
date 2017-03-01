package org.junitexample.coffeetalk.ut.depedency;

import org.junitexample.coffeetalk.ut.simple.EmailValidator;
import org.junitexample.coffeetalk.ut.subtype.ObjectsUtils;

public class PasswordValidatorDepency
    implements
    PasswordValidator {

    private final EmailValidator emailValidator;
    private final SequenceValidator sequenceValidator;
    private final BirthdayValidator birthdayValidator;

    public PasswordValidatorDepency(
        final EmailValidator emailValidator,
        final SequenceValidator sequenceValidator,
        final BirthdayValidator birthdayValidator) {
        super();
        this.emailValidator = emailValidator;
        this.sequenceValidator = sequenceValidator;
        this.birthdayValidator = birthdayValidator;
    }

    @Override
    public boolean validate(
        final String password) {
        ObjectsUtils.required(password); // #1
        if (emailValidator.isValid(password)) {
            throw new RuntimeException("Password can't not be your e-mail."); // #2
        }
        if (sequenceValidator.validate(password)) {
            throw new RuntimeException("Password can't be a sequence."); // #3
        }
        if (birthdayValidator.validate(password)) {
            throw new RuntimeException("Password can't be the birthday."); // #4
        }
        return true; // #5
    }
}

interface SequenceValidator
    extends
    PasswordValidator {
}

interface BirthdayValidator
    extends
    PasswordValidator {
}
