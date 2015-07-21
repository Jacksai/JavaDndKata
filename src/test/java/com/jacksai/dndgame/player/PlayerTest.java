package com.jacksai.dndgame.player;

import com.jacksai.dndgame.items.Item;
import com.jacksai.dndgame.items.weapon.Weapon;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    public static final String defaultPlayerName = "PLAYERNAME";
    public static final String defaultItemName = "ITEM_NAME";

    @Test
    public void shouldReturnCorrectHealthWithPositiveConstModifier() {
        //Arrange
        Player player = new Player.Builder(defaultPlayerName)
                .constitution(20) // +5 modifier
                .build();

        //Act
        int health = player.getHealth();

        //Assert
        assertEquals(10, health); //default health + constitution modifier
    }

    @Test
    public void shouldReturnAtLeastOneHealthWithMinimumModifier() {
        //Arrange
        int minimumStatistic = 1;
        Player player = new Player.Builder(defaultPlayerName)
                .constitution(minimumStatistic) // -5 modifier
                .build();

        //Act
        int health = player.getHealth();

        //Assert
        assertEquals(1, health);
    }

    @Test
    public void shouldReturnCorrectArmorClassWithPositiveDexModifier() {
        //Arrange
        int maximumStatistic = 20;
        Player player = new Player.Builder(defaultPlayerName)
                .dexterity(maximumStatistic) // +5 modifier
                .build();
        //Act
        int armorClass = player.getArmorClass();

        //Assert
        assertEquals(15, armorClass); //default armor + dexterity modifier
    }

    @Test
    public void shouldReturnCorrectArmorClassWithNegativeDexModifier() {
        //Arrange
        int minimumStatistic = 1;
        Player player = new Player.Builder(defaultPlayerName)
                .dexterity(minimumStatistic) // -5 modifier
                .build();
        //Act
        int armorClass = player.getArmorClass();

        //Assert
        assertEquals(5, armorClass);
    }

    @Test
    public void shouldAddItemToInventory() {
        //Arrange
        Item item = new Weapon(defaultItemName, 1.0, 1);
        Player player = new Player.Builder(defaultPlayerName)
                .build();

        //Act
        player.addItem(item);

        //Assert
        assertTrue(player.getInventory().contains(item));
    }

    @Test
    public void shouldReturnStatisticValues() {
        //Arrange
        int playerStrength = 10;
        int playerDexterity = 11;
        int playerConstitution = 12;
        int playerWisdom = 2;
        int playerIntelligence = 3;
        int playerCharisma = 5;

        //Act
        Player player = new Player.Builder(defaultPlayerName)
                .strength(playerStrength)
                .dexterity(playerDexterity)
                .constitution(playerConstitution)
                .wisdom(playerWisdom)
                .intelligence(playerIntelligence)
                .charisma(playerCharisma)
                .build();

        //Assert
        assertEquals(playerStrength, player.getStrength().getValue());
        assertEquals(playerDexterity, player.getDexterity().getValue());
        assertEquals(playerConstitution, player.getConstitution().getValue());
        assertEquals(playerWisdom, player.getWisdom().getValue());
        assertEquals(playerIntelligence, player.getIntelligence().getValue());
        assertEquals(playerCharisma, player.getCharisma().getValue());
    }
}