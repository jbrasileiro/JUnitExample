package org.junitexample.coffeetalk.ut.theory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junitexample.coffeetalk.ut.simple.EmailValidator;

@RunWith(Theories.class)
public class EmailValidatorPTest {

    private EmailValidator validator;

    @DataPoints
    public static String[]   data() {
        return new String[]{
            "joao.almeida@cwi.com.br",
            "some.body.else@cwi.com.br"
        };
    }

    @Before
    public void setUp() {
        validator = new EmailValidator();
    }

    @Theory
    public void test(final String email) {
        System.out.println(email);
        Assert.assertTrue(validator.isValid(email));
    }
}
