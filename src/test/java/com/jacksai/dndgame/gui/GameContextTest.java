package com.jacksai.dndgame.gui;

import com.googlecode.lanterna.gui.Window;
import com.jacksai.dndgame.gui.views.MainMenuView;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameContextTest {

    @Test
    public void shouldNotReturnNullWhenInitializinContext() {
        //Act
        GameContext context = GameContext.getGameContext();

        //Assert
        assertNotNull(context);
    }

    @Test
    public void shouldReturnSameInstanceOfGameContext() {
        //Arrange
        GameContext firstContext, secondContext;

        //Act
        firstContext = GameContext.getGameContext();
        secondContext = GameContext.getGameContext();

        //Assert
        assertTrue(firstContext == secondContext);
    }

    @Test
    public void shouldHavePopulatedGuiScreen() {

        //Arrange
        GameContext gameContext = GameContext.getGameContext() ;

        //Assert
        assertNotNull(gameContext.getGuiScreen());
    }

    @Test
    public void shouldHaveMainMenuAsInitialView() {

        //Arrange
        GameContext gameContext = GameContext.getGameContext();

        //Act
        Window currentWindow = gameContext.getCurrentWindow();

        //Assert
        assertTrue(currentWindow instanceof MainMenuView);

    }
}