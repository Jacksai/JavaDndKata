package com.jacksai.dndgame.player;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticTest {

    @Test
    public void statisticShouldBeNormalizedAfterCreationWithTooBigValue() throws Exception {
        //Arrange
        int tooBigStatistic = 100;
        Statistic statistic = new Statistic(tooBigStatistic);

        //Assert
        Assert.assertEquals(Statistic.MAX_STAT_VALUE, statistic.getValue());
    }

    @Test
    public void statisticShouldBeNormalizedAfterCreationWithTooSmallValue() throws Exception {
        //Arrange
        int tooSmallStatistic = -100;
        Statistic statistic = new Statistic(tooSmallStatistic);

        //Assert
        Assert.assertEquals(Statistic.MIN_STAT_VALUE, statistic.getValue());

    }

    @Test
    public void statisticShouldNotBeNormalizedAfterCreationWithCorrectStats() throws Exception {
        //Arrange
        int newStatisticValue = 17;
        Statistic statistic = new Statistic(newStatisticValue);

        //Assert
        Assert.assertEquals(newStatisticValue, statistic.getValue());
    }
}