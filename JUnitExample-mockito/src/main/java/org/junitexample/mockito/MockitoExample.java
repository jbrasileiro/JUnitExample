package org.junitexample.mockito;

import java.util.List;

import javax.inject.Inject;

import org.junitexample.mockito.itproject.AnyProjectException;
import org.junitexample.mockito.itproject.Developer;
import org.junitexample.mockito.itproject.DeveloperDAO;
import org.junitexample.mockito.itproject.INotTheBatmanDeveloperINeedHelp;
import org.junitexample.mockito.itproject.NoBestDeveloperAvaliable;
import org.junitexample.mockito.itproject.OKSomethingIsReallyWrongHereDontYouThinkSoExclamationPoint;
import org.junitexample.mockito.itproject.Project;
import org.junitexample.mockito.itproject.ProjectManager;
import org.junitexample.mockito.itproject.TypeDeveloperLevel;

/**
 * DIDATIC EXAMPLE, MAY; AND PROBABLY WILL HAVE SOME ISSUES.
 * 
 * @author joao.almeida
 *
 */
public class MockitoExample {

    private static final TypeDeveloperLevel DEFAULT_LEVEL = TypeDeveloperLevel.JUNIOR;
    private final DeveloperDAO developerDAO;

    /*
     * We use Dependency Injection through Contructors because is more Testable, and we will no need to change ours code under test to test.
     * 
     */
    @Inject
    public MockitoExample(
        final DeveloperDAO developerDAO) {
        super();
        this.developerDAO = developerDAO;
    }

    public Project createProject(
        final ProjectManager projectManager)
        throws AnyProjectException {
        if (projectManager == null) {
            throw new OKSomethingIsReallyWrongHereDontYouThinkSoExclamationPoint();
        } else {
            Developer bestDeveloper = developerDAO.getBestDeveloper();
            return createProject(bestDeveloper);
        }
    }

    private Project createProject(
        final Developer developer)
        throws AnyProjectException {
        if (developer == null) {
            throw new NoBestDeveloperAvaliable();
        }
        List<Developer> manyDeveloper = developerDAO.getLotOfDeveloper(DEFAULT_LEVEL);
        if (developer.isNotBatman() && hasNoDeveloper(manyDeveloper)) {
            throw new INotTheBatmanDeveloperINeedHelp();
        } else {
            Project newProject = new Project();
            newProject.addDeveloper(developer);
            for (Developer otherDeveloper : manyDeveloper) {
                newProject.addDeveloper(otherDeveloper);
            }
            return newProject;
        }
    }

    private boolean hasNoDeveloper(
        final List<Developer> manyDeveloper) {
        return manyDeveloper == null || manyDeveloper.isEmpty();
    }
}
