package org.junitexample.mockito;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junitexample.mockito.itproject.AnyProjectException;
import org.junitexample.mockito.itproject.Developer;
import org.junitexample.mockito.itproject.DeveloperDAO;
import org.junitexample.mockito.itproject.Project;
import org.junitexample.mockito.itproject.ProjectManager;
import org.junitexample.mockito.itproject.TypeDeveloperLevel;
import org.mockito.Mockito;

public class MockitoExampleTest {

    private MockitoExample test;
    private DeveloperDAO developerDAO;

    /*
     * We use @Before to make sure that for each test we have an clean test environment:
     *  - creating each time a new instance for each test dependency;
     *  - defining each time a new mock
     *  - [...]
     *  
     */
    @Before
    public void setUp() {
        developerDAO = Mockito.mock(DeveloperDAO.class);
        /*
         * it's good to name your variable with a easy name to see that is the "CLASS UNDER TEST" like:
         *  - test
         *  - instance
         *  - service
         *  - builder
         *  [...] 
         */
        test = new MockitoExample(developerDAO);
    }

    /*
     * Test name should have a meaning.
     * Different of production code, test code can be a little long, and they have also others privileges.
     * TEST HAVE 5 phases, but not always will be it.
     * 1 - PREPARE DATA
     * 2 - DEFINE MOCK BEHAVIOUR
     * 3 - EXECUTE TEST
     * 4 - VERIFY MOCK
     * 5 - ASSERTATION 
     */
    @Test
    public void shouldCreateProjectWithNormalDeveloper()
        throws AnyProjectException {
        // 1 - PREPARE DATA
        ProjectManager gp = new ProjectManager();
        Developer developer = new Developer(false);
        List<Developer> othersDev = Arrays.asList(new Developer(false));
        
        // 2 - DEFINE MOCK BEHAVIOUR
        Mockito.when(developerDAO.getBestDeveloper()).thenReturn(developer);
        Mockito.when(developerDAO.getLotOfDeveloper(anyDevLevel())).thenReturn(othersDev);
        
        // 3 - EXECUTE TEST
        Project result = test.createProject(gp);
        
        // 4 - VERIFY MOCK
        // I don't need to verify DeveloperDAO.getBestDeveloper() cause there is no special behaviour here.
        Mockito.verify(developerDAO, Mockito.times(1)).getLotOfDeveloper(eqJunirLevel());
        
        // 5 - ASSERTATION
        // I need to test if I have my main developer is on project:
        Assert.assertTrue(result.getPeople().contains(developer));
        // I also need to test all others developer is on project too:
        Assert.assertTrue(result.getPeople().containsAll(othersDev));
    }

    private TypeDeveloperLevel eqJunirLevel() {
        return Mockito.eq(TypeDeveloperLevel.JUNIOR);
    }

    private TypeDeveloperLevel anyDevLevel() {
        return Mockito.any(TypeDeveloperLevel.class);
    }
}
