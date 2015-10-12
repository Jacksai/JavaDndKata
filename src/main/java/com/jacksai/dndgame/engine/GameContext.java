package com.jacksai.dndgame.engine;

public class GameContext {

    private static GameContext currentContext = null;

    private GameContext() {}

    public static GameContext getCurrentContext() {
        if(currentContext == null) {
            currentContext = new GameContext();
        }
        return currentContext;
    }
}
