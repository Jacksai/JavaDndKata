package com.jacksai.dndgame.gui;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;

public class GuiApplication {

    public void startApplication() {
        GUIScreen guiScreen = TerminalFacade.createGUIScreen();
        guiScreen.getScreen().startScreen();
        Window window = new MainWindow();
        guiScreen.showWindow(window, GUIScreen.Position.CENTER);
        guiScreen.getScreen().stopScreen();
    }
}
