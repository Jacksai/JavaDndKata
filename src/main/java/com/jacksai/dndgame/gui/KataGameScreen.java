package com.jacksai.dndgame.gui;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;
import com.jacksai.dndgame.gui.views.MainMenuView;

public class KataGameScreen {

    private final String WINDOW_TITLE = "Java Kata Game";

    private GUIScreen guiScreen;
    private Window currentWindow;

    public KataGameScreen() {
        //creating gui Screen
        this.guiScreen = TerminalFacade.createGUIScreen();
        this.currentWindow = new MainMenuView(WINDOW_TITLE);
    }

    public void startGame() {
        if(guiScreen != null ) {
            guiScreen.getScreen().startScreen();
            guiScreen.showWindow(currentWindow, GUIScreen.Position.CENTER);
            guiScreen.getScreen().stopScreen();
        }
    }

    public GUIScreen getGuiScreen() {
        return guiScreen;
    }

    public Window getCurrentWindow() {
        return this.currentWindow;
    }
}
