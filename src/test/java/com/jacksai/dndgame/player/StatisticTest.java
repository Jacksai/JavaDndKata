package com.jacksai.dndgame.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticTest {

    @Test
    public void statisticShouldBeNormalizedAfterCreationWithTooBigValue() throws Exception {
        //Arrange
        int tooBigStatistic = 100;
        Statistic statistic = new Statistic(tooBigStatistic);

        //Assert
        assertEquals(Statistic.MAX_STAT_VALUE, statistic.getValue());
    }

    @Test
    public void statisticShouldBeNormalizedAfterCreationWithTooSmallValue() throws Exception {
        //Arrange
        int tooSmallStatistic = -100;
        Statistic statistic = new Statistic(tooSmallStatistic);

        //Assert
        assertEquals(Statistic.MIN_STAT_VALUE, statistic.getValue());
    }

    @Test
    public void statisticShouldNotBeNormalizedAfterCreationWithCorrectStats() throws Exception {
        //Arrange
        int newStatisticValue = 17;
        Statistic statistic = new Statistic(newStatisticValue);

        //Assert
        assertEquals(newStatisticValue, statistic.getValue());
    }
}