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
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
                .constitution(1) // -5 modifier
                .build();

        //Act
        int health = player.getHealth();

        //Assert
        Assert.assertEquals(1, health); //default health + constitution modifier
    }

    @Test
    public void shouldReturnCorrectArmorClassWithPositiveDexModifier() {

        //Arrange
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
                .dexterity(20) // +5 modifier
                .build();
        //Act
        int armorClass = player.getArmorClass();

        //Assert
        Assert.assertEquals(15, armorClass);
    }

    @Test
    public void shouldReturnCorrectArmorClassWithNegativeDexModifier() {

        //Arrange
        Player player = new Player.PlayerBuilder("NAME", Player.Alignment.GOOD)
                .dexterity(1) // -5 modifier
                .build();
        //Act
        int armorClass = player.getArmorClass();

        //Assert
        Assert.assertEquals(5, armorClass);
    }

}