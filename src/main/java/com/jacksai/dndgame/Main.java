package com.jacksai.dndgame;

import com.jacksai.dndgame.gui.GameContext;

public class Main {
    public static void main(String[] args) {
        GameContext gameContext = GameContext.getGameContext();
        gameContext.renderScreen();
    }
}
