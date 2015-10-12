package com.jacksai.dndgame.gui;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;
import com.jacksai.dndgame.gui.views.MainMenuView;

public class GameContext {

    private GUIScreen guiScreen;
    private Window currentWindow;
    private static GameContext gameContext;

    private GameContext() {
        //creating gui Screen
        this.guiScreen = TerminalFacade.createGUIScreen();
        this.currentWindow = new MainMenuView();
    }

    public static GameContext getGameContext() {
        if(gameContext == null) gameContext = new GameContext();
        return gameContext;
    }

    public void renderScreen() {
        if(guiScreen != null ) {
            guiScreen.getScreen().startScreen();
            guiScreen.showWindow(currentWindow, GUIScreen.Position.CENTER);
            guiScreen.getScreen().stopScreen();
        }
    }

    public void changeView(Window newView) {
        this.currentWindow = newView;
        renderScreen();
    }

    public GUIScreen getGuiScreen() {
        return guiScreen;
    }

    public Window getCurrentWindow() {
        return this.currentWindow;
    }
}
