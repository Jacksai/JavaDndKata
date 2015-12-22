package com.jacksai.dndgame.player;

public class Statistic {

    private static final int DEFAULT_STAT_VALUE = 10;
    public static final int MAX_STAT_VALUE = 20;
    public static final int MIN_STAT_VALUE = 1;

    private final int value;

    public Statistic() {
        this(DEFAULT_STAT_VALUE);
    }

    public Statistic(int value) {
        this.value = normalizeValue(value);
    }

    private int normalizeValue(int value) {
        return Math.min(MAX_STAT_VALUE, Math.max(MIN_STAT_VALUE, value));
    }

    public int getValue() {
        return value;
    }

    public int getModifier() {
        return ((int) Math.floor((double) (value - 10) / 2.0));
    }
}
