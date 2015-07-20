package com.jacksai.dndgame.engine.states;


import com.jacksai.dndgame.engine.GameContext;

public interface State {
    void doAction(GameContext gameContext);
}
