package com.jacksai.dndgame.gui;

import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.component.Panel;

public class MainWindow extends Window {

    public MainWindow() {
        super("Java Kata");

        Panel mainPanel = new Panel(new Border.Invisible(), Panel.Orientation.HORISONTAL);
        mainPanel.addComponent(new Label("Welcome"));
        mainPanel.addComponent(new Button("Close me!", () -> System.exit(0)));

        addComponent(mainPanel);

    }
}
