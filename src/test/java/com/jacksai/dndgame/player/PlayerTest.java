package com.jacksai.dndgame.player;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(10, health); //default health + constitution modifier
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
        Assert.assertEquals(1, health);
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
        Assert.assertEquals(15, armorClass); //default armor + dexterity modifier
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
        Assert.assertEquals(5, armorClass);
    }
}