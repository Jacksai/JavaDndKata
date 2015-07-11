package com.jacksai.dndgame.player;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StatisticTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, -5},
                {2, -4},
                {3, -4},
                {4, -3},
                {5, -3},
                {6, -2},
                {7, -2},
                {8, -1},
                {9, -1},
                {10, 0},
                {11, 0},
                {12, 1},
                {13, 1},
                {14, 2},
                {15, 2},
                {16, 3},
                {17, 3},
                {18, 4},
                {19, 4},
                {20, 5}

        });
    }

    public StatisticTest(int statistic, int expectedModifier) {
        statValue = statistic;
        this.expectedModifier = expectedModifier;
    }

    private int statValue;
    private int expectedModifier;

    @Test
    public void shouldReturnValidModifierForStatistic() throws Exception {

        //Arrange
        Statistic stat = new Statistic(statValue);
        //Act
        int returnedModifier = stat.getModifier();
        //Assert
        assertEquals(expectedModifier, returnedModifier);
    }


}