package com.jacksai.dndgame.gui;

import com.jacksai.dndgame.engine.GameContext;
import com.jacksai.dndgame.gui.asciiPanel.AsciiPanel;

import javax.swing.*;

public class GuiApplication extends JFrame {

    private AsciiPanel terminal;

    public GuiApplication() {
//        super();
//        terminal = new AsciiPanel();
//        terminal.write("RL Tuturial", 1,1);
//        add(terminal);
//        pack();
        GameContext gameContext = new GameContext();
    }

}
