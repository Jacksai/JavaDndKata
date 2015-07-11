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

    public int getModifier() throws Exception {
        if (value < 2) return -5;
        if (value < 4) return -4;
        if (value < 6) return -3;
        if (value < 8) return -2;
        if (value < 10) return -1;
        if (value < 12) return 0;
        if (value < 14) return 1;
        if (value < 16) return 2;
        if (value < 18) return 3;
        if (value < 20) return 4;
        if (value == 20) return 5;

        return Integer.MIN_VALUE;
    }
}
