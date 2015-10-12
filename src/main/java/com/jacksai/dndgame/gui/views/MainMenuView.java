package com.jacksai.dndgame.gui.views;

import com.googlecode.lanterna.gui.*;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Panel;
import com.googlecode.lanterna.gui.layout.BorderLayout;

public class MainMenuView extends Window  {

    Button newGameButton;
    Button exitButton;

    public MainMenuView(String title) {
        super(title);

        Panel mainMenuPanel = new Panel(new Border.Standard(), Panel.Orientation.VERTICAL);

        newGameButton = new Button("New Game", () -> System.out.println("New game started"));
        exitButton = new Button("Exit", () -> System.exit(0));

        mainMenuPanel.addComponent(newGameButton);
        mainMenuPanel.addComponent(exitButton);

        addComponent(mainMenuPanel, BorderLayout.CENTER);
    }
}
