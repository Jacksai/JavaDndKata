package com.jacksai.dndgame.gui;


import com.jacksai.dndgame.gui.asciiPanel.AsciiPanel;

import java.util.logging.Logger;

public class TerminalSingleton {

    private static final Logger logger = Logger.getLogger(TerminalSingleton.class.getName());

    private AsciiPanel terminal;
    private static TerminalSingleton instance = null;

    private TerminalSingleton(){
        terminal = new AsciiPanel();
    }

    public static TerminalSingleton getInstance() {
        if(instance == null) {
            logger.info("creating first instance of terminal singleton");
            instance = new TerminalSingleton();
        }
        return instance;
    }

    public AsciiPanel getTerminal() {
        return terminal;
    }
}
