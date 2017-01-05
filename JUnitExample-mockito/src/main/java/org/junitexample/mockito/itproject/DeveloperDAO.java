package org.junitexample.mockito.itproject;

import java.util.List;

public interface DeveloperDAO {

    Developer getBestDeveloper();

    List<Developer> getLotOfDeveloper(TypeDeveloperLevel minimalLevelRequired);
}
