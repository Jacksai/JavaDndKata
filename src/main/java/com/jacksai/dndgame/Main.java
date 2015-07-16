package com.jacksai.dndgame;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.dialog.DialogResult;
import com.googlecode.lanterna.gui.dialog.MessageBox;

public class Main {

    public static void main(String[] args) {
        GUIScreen guiScreen = TerminalFacade.createGUIScreen();
        guiScreen.getScreen().startScreen();
        DialogResult result = MessageBox.showMessageBox(guiScreen, "Hello", "Welcome in JavaKata game");

    }

}
