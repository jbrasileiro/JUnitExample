package org.junitexample.coffeetalk.ut.subtype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Bean2XMLTransformerTest {

    private Bean2XMLTransformer transformer;
    private static final AnyObject NULL = null;

    @Before
    public void setUp() {
        transformer = new Bean2XMLTransformer();
    }

    @Test
    public void testTransformObject() {
        String result = transformer.transform(new AnyObject());
        Assert.assertEquals("<xml>ANY_VALUE</xml>", result);
    }
    
    @Test
    public void testTransformObjectNull() {
        String result = transformer.transform(NULL);
        Assert.assertEquals("<xml></xml>", result);
    }
}

class AnyObject {

    @Override
    public String toString() {
        return "ANY_VALUE";
    }
}
