package com.jacksai.dndgame.engine;


import com.jacksai.dndgame.engine.states.InitializingStats;
import com.jacksai.dndgame.engine.states.State;

public class GameEngine {

    private State currentGameState;
    private GameContext gameContext;

    public GameEngine() {
        currentGameState = new InitializingStats(gameContext);
    }

    public void start() {
        currentGameState.doAction(gameContext);
    }
}
