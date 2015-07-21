package com.jacksai.dndgame.engine.states;

import com.jacksai.dndgame.engine.GameContext;
import com.jacksai.dndgame.gui.TerminalSingleton;
import com.jacksai.dndgame.gui.asciiPanel.AsciiPanel;

public class MainMenuState implements State {

    private static AsciiPanel terminal = TerminalSingleton.getInstance().getTerminal();

    @Override
    public void doAction(GameContext gameContext) {
        //Handling main menu
        terminal.write("  Main Menu", 1, 1);
        terminal.write("1.New game", 1, 2);
        terminal.write("2.Exit", 1, 3);
    }
}
