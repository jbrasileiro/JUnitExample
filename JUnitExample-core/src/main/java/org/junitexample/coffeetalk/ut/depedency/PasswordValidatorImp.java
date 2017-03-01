package org.junitexample.coffeetalk.ut.depedency;

import java.util.Collection;

public class PasswordValidatorImp
    implements
    PasswordValidator {

    private final Collection<PasswordValidator> validators;

    public PasswordValidatorImp(
        final Collection<PasswordValidator> validators) {
        super();
        this.validators = validators;
    }

    @Override
    public boolean validate(
        final String password) {
        for (PasswordValidator passwordValidator : validators) {
            passwordValidator.validate(password);
        }
        return true;
    }
}
