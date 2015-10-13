package com.jacksai.dndgame.gui.views;

import com.googlecode.lanterna.gui.Action;
import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.*;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.jacksai.dndgame.gui.GameContext;
import com.jacksai.dndgame.player.Player;
import com.jacksai.dndgame.player.PlayerNature;

public class CharacterCreationView extends Window {

    private static final String WINDOW_TITLE = "Character creation";
    private static final String DEFAULT_STATISTIC_VALUE = "5";

    //TODO: Populate this and show when validation of statistics will fail
    private String errorMessage;

    private TextBox characterName;

    private TextBox strengthTextBox = new TextBox();
    private TextBox dexterityTextBox = new TextBox();
    private TextBox constitutionTextBox = new TextBox();
    private TextBox wisdomTextBox = new TextBox();
    private TextBox intelligenceTextBox = new TextBox();
    private TextBox charismaTextBox = new TextBox();
    private RadioCheckBoxList playerAlignmentOption;

    public CharacterCreationView() {
        super(WINDOW_TITLE);

        Panel panel = new Panel(new Border.Bevel(true), Panel.Orientation.VERTICAL);

        panel.addComponent(new Label("Create Your Character"));
        panel.addComponent(createPanelWithCharacterName());
        panel.addComponent(createComponentWithStatistics());
        panel.addComponent(createCharacterAlignmentPanel());

        Panel bottomPanel = new Panel(new Border.Invisible(), Panel.Orientation.HORISONTAL);
        bottomPanel.addComponent(new Button("EXIT", () -> System.exit(0)));
        bottomPanel.addComponent(new Button("NEXT", new FinishCharacterCreationAction()));

        addComponent(panel);
        addComponent(bottomPanel);
    }

    private Panel createCharacterAlignmentPanel() {
        Panel panel = new Panel(new Border.Standard(), Panel.Orientation.VERTICAL);

        playerAlignmentOption = new RadioCheckBoxList();
        playerAlignmentOption.addItem(new String("GOOD"));
        playerAlignmentOption.addItem(new String("NEUTRAL"));
        playerAlignmentOption.addItem(new String("BAD"));

        //Default selected option
        playerAlignmentOption.setCheckedItemIndex(1);

        panel.addComponent(playerAlignmentOption);

        return panel;
    }

    private Panel createPanelWithCharacterName() {
        Panel panel = new Panel(new Border.Standard(),Panel.Orientation.HORISONTAL);

        panel.addComponent(new Label("Name: "));
        characterName = new TextBox();
        panel.addComponent(characterName);
        characterName.setPreferredSize(new TerminalSize(19, 1));

        return panel;
    }

    private Panel createComponentWithStatistics() {
        Panel panel = new Panel(new Border.Standard(), Panel.Orientation.VERTICAL);

        panel.addComponent(createStatisticLine("Strength:      ", strengthTextBox));
        panel.addComponent(createStatisticLine("Dexterity:     ", dexterityTextBox));
        panel.addComponent(createStatisticLine("Constitution: :", constitutionTextBox));
        panel.addComponent(createStatisticLine("Wisdom:        ", wisdomTextBox));
        panel.addComponent(createStatisticLine("Intelligence:  ", intelligenceTextBox));
        panel.addComponent(createStatisticLine("Charisma:      ", charismaTextBox));

        return panel;
    }

    private Panel createStatisticLine(String statisticLabel, TextBox statisticTextBox) {
        Panel panel = new Panel(new Border.Invisible(), Panel.Orientation.HORISONTAL);

        panel.addComponent(new Label(statisticLabel));
        //statisticTextBox = new TextBox();
        statisticTextBox.setText(DEFAULT_STATISTIC_VALUE);
        panel.addComponent(statisticTextBox);

        return panel;
    }

    private class FinishCharacterCreationAction implements Action {

        private GameContext gameContext = GameContext.getGameContext();
        private final int MINIMUM_STATISTIC_VALUE = 0;
        private final int DEFAULT_STATISTIC_VALUE = 5;

        @Override
        public void doAction() {

            Player player = new Player.Builder(characterName.getText())
                    .strength(extractValueFromTextBox(strengthTextBox))
                    .dexterity(extractValueFromTextBox(dexterityTextBox))
                    .constitution(extractValueFromTextBox(constitutionTextBox))
                    .wisdom(extractValueFromTextBox(wisdomTextBox))
                    .intelligence(extractValueFromTextBox(intelligenceTextBox))
                    .charisma(extractValueFromTextBox(charismaTextBox))
                    .alignment(PlayerNature.valueOf((String) playerAlignmentOption.getCheckedItem()))
                    .build();

            gameContext.setPlayer(player);
            gameContext.changeView(new InformationView());
        }

        private Integer extractValueFromTextBox(TextBox textBox) {

            int extractedValue = MINIMUM_STATISTIC_VALUE;
            if(textBox.getText() != null) {
                try {
                    extractedValue = Integer.parseInt(textBox.getText());
                } catch (NumberFormatException ex) {
                    extractedValue = DEFAULT_STATISTIC_VALUE;
                }

            }

            return extractedValue;
        }

    }
}
