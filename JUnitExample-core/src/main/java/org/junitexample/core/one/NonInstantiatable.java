package org.junitexample.core.one;

import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.security.auth.login.Configuration;

public class NonInstantiatable {

    private static final String API_KEY = "d869db7fe62fb07c";
    private static final Map<String, ?> entry;
    private static SessionConfiguration sessionConfiguration;
    
    static {
        try {
            String serverHostName = System.getenv("ACL_SERVER_HOST");
            sessionConfiguration = InitialContext.doLookup(API_KEY);
            Configuration conf = Configuration.getConfiguration();
            entry = conf.getAppConfigurationEntry(serverHostName)[0].getOptions();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    public NonInstantiatable() {
        super();
    }

    public Boolean canReach() {
        return entry.get(sessionConfiguration.getValue()).equals(Boolean.TRUE);
    }
}
