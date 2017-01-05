package org.junitexample.mockito.itproject;

import java.util.ArrayList;
import java.util.Collection;

public class Project {

    private Collection<People> people;

    public Collection<People> getPeople() {
        return people;
    }

    public void setPeople(
        final Collection<People> people) {
        this.people = people;
    }

    public void addDeveloper(
        final Developer developer) {
        if (getPeople() == null) {
            setPeople(new ArrayList<People>());
        }
        getPeople().add(developer);
    }
}
