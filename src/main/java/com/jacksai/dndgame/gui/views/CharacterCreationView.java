package com.jacksai.dndgame.gui.views;

import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.component.Panel;
import com.googlecode.lanterna.gui.component.TextBox;

public class CharacterCreationView extends Window {

    private static final String WINDOW_TITLE = "Character creation";

    public CharacterCreationView() {
        super(WINDOW_TITLE);

        Panel panel = new Panel(new Border.Bevel(true), Panel.Orientation.VERTICAL );

        panel.addComponent(new Label("Create Your Character"));
        panel.addComponent(createPanelWithCharactername());
        panel.addComponent(createTableWithStats());
        panel.addComponent(new Button("EXIT", () -> System.exit(0)));

        addComponent(panel);
    }

    private Panel createPanelWithCharactername() {
        Panel panel = new Panel(new Border.Standard(),Panel.Orientation.HORISONTAL);

        panel.addComponent(new Label("Name: "));
        panel.addComponent(new TextBox());

        return panel;
    }

    private Panel createTableWithStats() {
        Panel panel = new Panel(new Border.Standard(), Panel.Orientation.VERTICAL);

        panel.addComponent(createStrenghtLine());
        panel.addComponent(createDexternityLine());

        return panel;
    }

    private Panel createStrenghtLine() {
        Panel panel = new Panel(new Border.Invisible(),Panel.Orientation.HORISONTAL);

        panel.addComponent(new Label("Strength: "));
        panel.addComponent(new TextBox());

        return panel;
    }

    private Panel createDexternityLine() {
        Panel panel = new Panel(new Border.Invisible(),Panel.Orientation.HORISONTAL);

        panel.addComponent(new Label("Dexternity: "));
        panel.addComponent(new TextBox());

        return panel;
    }
}
