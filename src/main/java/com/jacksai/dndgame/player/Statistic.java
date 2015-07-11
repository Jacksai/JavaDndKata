package com.jacksai.dndgame.player;

public class Statistic {

    private static int MAX_STAT_VALUE = 20;
    private static int MIN_STAT_VALUE = 1;

    final private int value;

    public Statistic(int value) {
        checkValidity(value);
        this.value = value;
    }

    private void checkValidity(int value) {
        if(value > MAX_STAT_VALUE || value < MIN_STAT_VALUE) {
            throw new IllegalArgumentException("Invalid statistic value");
        }
    }

    public int getModifier() {
        return ((int) Math.floor((double) (value - 10) / 2.0));
    }
}
