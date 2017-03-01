package org.junitexample.coffeetalk.ut.subtype;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractTransformerCollectionToTest {

    private AbstractTransformerCollectionTo<Object, Object> transformer;

    @Before
    public void setUp() {
        transformer = new AbstractTransformerCollectionTo<Object, Object>() {

            @Override
            public Object transform(
                final Object in) {
                return "NEW OBJECT";
            }
        };
    }

    @Test
    public void testTransformNull() {
        Collection<Object> result = transformer.transform(null);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testTransformEmpty() {
        Collection<Object> result = transformer.transform(Collections.emptyList());
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testTransformCollectionWithNull() {
        Collection<Object> result = transformer.transform(Arrays.asList((Object) null));
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testTransform() {
        Collection<Object> result = transformer.transform(Arrays.asList(new Object()));
        Assert.assertEquals(result.size(), 1, 0);
    }
}
