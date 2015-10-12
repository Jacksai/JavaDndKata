package com.jacksai.dndgame.engine;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameContextTest {

    @Test
    public void shouldNotReturnNullWhenInitializinContext() {
        //Act
        GameContext context = GameContext.getCurrentContext();

        //Assert
        assertNotNull(context);
    }

    @Test
    public void shouldReturnSameInstanceOfGameContext() {
        //Arrange
        GameContext firstContext, secondContext;

        //Act
        firstContext = GameContext.getCurrentContext();
        secondContext = GameContext.getCurrentContext();

        //Assert
        assertTrue(firstContext == secondContext);
    }
}