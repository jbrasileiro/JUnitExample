package org.junitexample.mockito.itproject;

public enum TypeDeveloperLevel {
        I_AM_BATMAN(0L),
        NINJA(1L),
        DUNGEON_MASTER(2L),
        SENIOR(2L),
        PLAIN_TEXT(4L),
        FLAT(5L),
        JUNIOR(6L),
        WHAT_I_KNOW_HOW_TO_TURN_THE_PC_ON(Long.MAX_VALUE);

    private final Long level;

    TypeDeveloperLevel(
        final Long level) {
        this.level = level;
    }

    public Long getLevel() {
        return level;
    }
}
