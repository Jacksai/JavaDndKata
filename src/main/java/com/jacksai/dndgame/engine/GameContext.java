package com.jacksai.dndgame.engine;

import com.jacksai.dndgame.engine.states.State;

import java.util.logging.Logger;

public class GameContext {

    private static final Logger logger = Logger.getLogger(GameContext.class.getName());

    private State currentState;

    public GameContext() {
        logger.info("GameContext()");
    }

    public void setState(State newState) {
        logger.info("Changing state to " + newState.getClass().getName());
        newState.doAction(this);
        currentState = newState;
    }

    public State getCurrentState() {
        return currentState;
    }
}
