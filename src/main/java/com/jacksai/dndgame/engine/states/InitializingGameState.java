package com.jacksai.dndgame.engine.states;

import com.jacksai.dndgame.engine.GameContext;
import com.jacksai.dndgame.gui.GameGui;

import javax.swing.*;
import java.util.logging.Logger;

public class InitializingGameState implements State {

    private static final Logger logger = Logger.getLogger(InitializingGameState.class.getName());

    public InitializingGameState() {}

    @Override
    public void doAction(GameContext gameContext) {
        logger.info("InitalizingGameState.doAction()");

        //Starting window
        GameGui gui  = new GameGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);

        gameContext.setState(new MainMenuState());
    }
}
