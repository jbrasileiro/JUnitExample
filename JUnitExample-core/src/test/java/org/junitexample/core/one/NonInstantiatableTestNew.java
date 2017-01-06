package org.junitexample.core.one;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonInstantiatableTestNew {

    private static final String KEY = "any-key";
    private NonInstantiatableNew test;
    private Map<String, Object> map;

    @Before
    public void setUp() {
        //Must be before instance of class: NonInstantiatableConfigurationFactoryT.
        map = new HashMap<>();
        //Must be before instance of class: NonInstantiatableNew.
        NonInstantiatableConfigurationFactory.nonInstantiatableConfigurationFactory = new NonInstantiatableConfigurationFactoryT(map);
        test = new NonInstantiatableNew();
    }

    @Test
    public void testTrue() {
        map.put(KEY, Boolean.TRUE);
        Assert.assertTrue(test.canReach());
    }
    
    @Test
    public void testFalse() {
        map.put(KEY, Boolean.FALSE);
        Assert.assertFalse(test.canReach());
    }
}

class NonInstantiatableConfigurationFactoryT extends NonInstantiatableConfigurationFactory {
    private final Map<String, ?> map;
    
    public NonInstantiatableConfigurationFactoryT(
        final Map<String, ?> map) {
        super();
        this.map = map;
    }

    @Override
    public NonInstantiatableConfiguration create() {
        return new NonInstantiatableConfiguration() {
            
            @Override
            public SessionConfiguration getSessionConfiguration() {
                return new SessionConfiguration();
            }
            
            @Override
            public Map<String, ?> getEntry() {
                return map;
            }
            
            @Override
            public void execute() {
            }
        };
    }
}