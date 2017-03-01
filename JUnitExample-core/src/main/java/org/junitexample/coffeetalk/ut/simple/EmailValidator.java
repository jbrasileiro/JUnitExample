package org.junitexample.coffeetalk.ut.simple;

import org.junitexample.coffeetalk.ut.subtype.ObjectsUtils;

public class EmailValidator {

    private static final String REGEX_EMAIL = "[\\w\\.]{3,}\\@cwi\\.com\\.br";

    public boolean isValid(
        final String value) {
        ObjectsUtils.required(value); //#1
        if (value.matches(REGEX_EMAIL)) {
            return true; //#2
        } else {
            return false;  //#3
        }
    }
}
