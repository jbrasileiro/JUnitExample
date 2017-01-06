package org.junitexample.core.one;

import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.security.auth.login.Configuration;

public class NonInstantiatableNew {

    private static Map<String, ?> entry;
    private static SessionConfiguration sessionConfiguration;
    
    static {
        /*
         * STEP 02.A: IDENTIFY AND MOVE ALL THE LOGIC TO AN IMPLEMENTATION: 
         */
        /*
         * STEP 03.A: CREATE A FACOTRY AND USE IT TO GET INSTANCE OF THE NEW OBJECT: 
         */
        NonInstantiatableConfiguration conf  = NonInstantiatableConfigurationFactory.getInstance().create();
        conf.execute();
        sessionConfiguration = conf.getSessionConfiguration();
        entry = conf.getEntry();
    }

    public NonInstantiatableNew() {
        super();
    }

    public Boolean canReach() {
        return entry.get(sessionConfiguration.getValue()).equals(Boolean.TRUE);
    }
}

/*
 * STEP 01: Create an interface to operate over your changes.
 */

interface NonInstantiatableConfiguration{

    void execute();

    Map<String, ?> getEntry();

    SessionConfiguration getSessionConfiguration();
    
}

/*
 * STEP 02.B: IDENTIFY AND MOVE ALL THE LOGIC TO AN IMPLEMENTATION: 
 */
class NonInstantiatableConfigurationImp
    implements
    NonInstantiatableConfiguration {

    private static final String API_KEY = "d869db7fe62fb07c";
    private SessionConfiguration sessionConfiguration;
    private Map<String, ?> entry;

    @Override
    public void execute() {
        try {
            String serverHostName = System.getenv("ACL_SERVER_HOST");
            sessionConfiguration = InitialContext.doLookup(API_KEY);
            Configuration conf = Configuration.getConfiguration();
            entry = conf.getAppConfigurationEntry(serverHostName)[0].getOptions();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }        
    }

    @Override
    public Map<String, ?> getEntry() {
        return entry;
    }

    @Override
    public SessionConfiguration getSessionConfiguration() {
        return sessionConfiguration;
    }
}
/*
 * STEP 03.B: CREATE A FACOTRY AND USE IT TO GET INSTANCE OF THE NEW OBJECT: 
 */
class NonInstantiatableConfigurationFactory {

    static NonInstantiatableConfigurationFactory nonInstantiatableConfigurationFactory = new NonInstantiatableConfigurationFactory();
    
    public static NonInstantiatableConfigurationFactory getInstance() {
        return nonInstantiatableConfigurationFactory;
    }

    public NonInstantiatableConfiguration create() {
        return new NonInstantiatableConfigurationImp();
    }
    
}
