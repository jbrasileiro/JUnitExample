package org.junitexample.coffeetalk.ut.simple;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EmailValidatorPTest {

    private EmailValidator validator;
    private final boolean expected;
    private final String email;

    @Parameters(
        name = "#{index}: validation email: {1} - expected be :\"{0}\" ")
    public static Iterable<Object[]> data() {
        List<Object[]> parameters = new ArrayList<>();
        parameters.add(addTrue("joao.almeida@cwi.com.br"));
        parameters.add(addTrue("some.body.else@cwi.com.br"));
        
        parameters.add(addFalse("joao.almeida@otaempresa.com.br"));
        parameters.add(addFalse("joao.almeida@otaempresaII.com.br"));
        return parameters;
    }

    private static Object[] addTrue(
        final String email) {
        return add(true, email);
    }

    private static Object[] addFalse(
        final String email) {
        return add(false, email);
    }

    private static Object[] add(
        final boolean expected,
        final String email) {
        return new Object[] {
            expected,
            email
        };
    }

    public EmailValidatorPTest(
        final boolean expected,
        final String email) {
        super();
        this.expected = expected;
        this.email = email;
    }

    @Before
    public void setUp() {
        validator = new EmailValidator();
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, validator.isValid(email));
    }
}