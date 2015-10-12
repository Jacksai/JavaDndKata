package com.jacksai.dndgame.gui.views;

import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.component.Panel;

public class CharacterCreationView extends Window {

    private static final String WINDOW_TITLE = "Character creation";

    public CharacterCreationView() {
        super(WINDOW_TITLE);

        Panel characterCreationPanel = new Panel(new Border.Bevel(true), Panel.Orientation.HORISONTAL );
        characterCreationPanel.addComponent(new Label("Create Your Character"));
        characterCreationPanel.addComponent(new Button("EXIT", () -> System.exit(0)));

        addComponent(characterCreationPanel);
    }
}
