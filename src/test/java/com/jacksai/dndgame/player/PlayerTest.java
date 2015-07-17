package com.jacksai.dndgame.player;

import com.jacksai.dndgame.items.Item;
import com.jacksai.dndgame.items.weapon.Weapon;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void shouldReturnCorrectHealthWithPositiveConstModifier() {
        //Arrange
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
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
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
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
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
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
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
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
        Item item = new Weapon("Weapon name", 1.0, 1);
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
                .build();

        //Act
        player.addItem(item);

        //Assert
        assertTrue(player.getInventory().contains(item));
    }
}