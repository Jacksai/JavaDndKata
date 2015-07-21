package com.jacksai.dndgame.engine;


import com.jacksai.dndgame.engine.states.InitializingGameState;
import com.jacksai.dndgame.engine.states.State;

import java.util.logging.Logger;

public class GameEngine {

    private static final Logger logger = Logger.getLogger(GameEngine.class.getName());

    private GameContext gameContext;

    public GameEngine() {
        logger.info("GameEngine()");
        gameContext = new GameContext();
    }

    public void start() {
        logger.info("GameEngine.start()");
        gameContext.setState(new InitializingGameState());
    }
}
