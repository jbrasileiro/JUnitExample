package org.junitexample.coffeetalk.ut.theory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {

    @DataPoints
    public static String[] data = new String[] {
        "foo",
        "bar"
    };
    @DataPoint
    public static String baz = "baz";

    @DataPoints
    public static Integer[] getData() {
        return new Integer[] {
            1,
            2
        };
    }

    /**
     * If two objects are equal, they must have the same hashcode
     * 
     * @param x
     * @param y
     */
    @Theory
    public void testHashcodeEquals(
        final Object x,
        final Object y) {
        System.out.println(print(x, y));
        assumeThat(x.equals(y), is(true));
        assertThat(x.hashCode(), is(y.hashCode()));
    }

    private String print(
        final Object x,
        final Object y) {
        StringBuilder builder = new StringBuilder();
        builder.append("object x:");
        builder.append(x);
        builder.append(" | ");
        builder.append("object y:");
        builder.append(y);
        return builder.toString();
    }
}
