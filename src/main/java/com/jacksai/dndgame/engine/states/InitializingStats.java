package com.jacksai.dndgame.engine.states;

import com.jacksai.dndgame.engine.GameContext;
import com.jacksai.dndgame.engine.GameEngine;

import java.util.logging.Logger;

public class InitializingStats implements State {

    private static final Logger logger = Logger.getLogger(InitializingStats.class.getName());


    public InitializingStats() {

    }

    @Override
    public void doAction(GameContext gameContext) {
        logger.info("Starting changing state");

        //Initialize Game Context

    }
}
