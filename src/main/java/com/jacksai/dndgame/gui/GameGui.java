package com.jacksai.dndgame.gui;

import com.jacksai.dndgame.gui.asciiPanel.AsciiPanel;

import javax.swing.*;
import java.util.logging.Logger;

public class GameGui extends JFrame {

    private static final Logger logger = Logger.getLogger(GameGui.class.getName());

    private static AsciiPanel terminal = TerminalSingleton.getInstance().getTerminal();

    public GameGui() {
        super();
        logger.info("GameGui()");
        add(terminal);
        pack();
    }

}
