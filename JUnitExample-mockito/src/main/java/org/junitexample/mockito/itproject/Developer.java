package org.junitexample.mockito.itproject;

public class Developer
    implements
    People {

    private final boolean isBatman;

    public Developer(
        final boolean isBatman) {
        super();
        this.isBatman = isBatman;
    }

    public boolean isBatman() {
        return isBatman;
    }

    public boolean isNotBatman() {
        return !isBatman();
    }
}
