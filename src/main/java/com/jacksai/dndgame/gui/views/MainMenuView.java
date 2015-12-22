package com.jacksai.dndgame.gui.views;

import com.googlecode.lanterna.gui.*;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Panel;
import com.googlecode.lanterna.gui.layout.BorderLayout;
import com.jacksai.dndgame.gui.GameContext;

public class MainMenuView extends Window {

    private static final String WINDOW_TITLE = "Java Kata Game";

    Button newGameButton;
    Button exitButton;

    public MainMenuView() {
        super(WINDOW_TITLE);

        Panel mainMenuPanel = new Panel(new Border.Standard(), Panel.Orientation.VERTICAL);

        newGameButton = new Button("New Game", () -> {
            this.close();
            GameContext.getGameContext().changeView(new CharacterCreationView());
        });
        exitButton = new Button("Exit", () -> System.exit(0));

        mainMenuPanel.addComponent(newGameButton);
        mainMenuPanel.addComponent(exitButton);

        addComponent(mainMenuPanel, BorderLayout.CENTER);
    }
}
