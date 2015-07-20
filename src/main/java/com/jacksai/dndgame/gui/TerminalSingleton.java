package com.jacksai.dndgame.gui;


import com.jacksai.dndgame.gui.asciiPanel.AsciiPanel;

public class TerminalSingleton {

    private AsciiPanel terminal;
    private static TerminalSingleton instance = null;

    private TerminalSingleton(){

    }

    public static TerminalSingleton getInstance() {
        if(instance == null) {
            instance = new TerminalSingleton();
        }
        return instance;
    }

}
