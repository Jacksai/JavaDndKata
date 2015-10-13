package com.jacksai.dndgame.gui.views;

import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.component.Panel;
import com.jacksai.dndgame.gui.GameContext;
import com.jacksai.dndgame.player.Player;

public class InformationView extends Window {

    private final static String WINDOW_TITLE = "Information";

    private Player player = GameContext.getGameContext().getPlayer();

    public InformationView() {
        super(WINDOW_TITLE);

        Panel panel = new Panel(new Border.Standard(), Panel.Orientation.VERTICAL);

        Panel nameInfoPanel = new Panel(new Border.Invisible(), Panel.Orientation.HORISONTAL);

        nameInfoPanel.addComponent(new Label("NAME: "));
        nameInfoPanel.addComponent(new Label(player.getName()));

        panel.addComponent(nameInfoPanel);

        addComponent(panel);
    }

}
