package com.jacksai.dndgame.gui;

import com.googlecode.lanterna.gui.Window;
import com.jacksai.dndgame.gui.views.MainMenuView;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameScreenTest {

    @Test
    public void shouldHavePopulatedGuiScreen() {

        //Arrange
        KataGameScreen gameScreen = new KataGameScreen();

        //Assert
        assertNotNull(gameScreen.getGuiScreen());
    }

    @Test
    public void shouldHaveMainMenuAsInitialView() {

        //Arrange
        KataGameScreen gameScreen = new KataGameScreen();

        //Act
        Window currentWindow = gameScreen.getCurrentWindow();

        //Assert
        assertTrue(currentWindow instanceof MainMenuView);

    }
}