package com.jacksai.dndgame.items.armor;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArmorTest {

    @Test
    public void shouldCreateCorrectArmor() {
        //Arrange
        String armorName = "Epic chainmail";
        Double armorWeight = 14.5d;
        Integer armorRating = 3;

        //Act
        Armor armor = new Armor(armorName, armorWeight, armorRating);

        //Assert
        assertEquals(armorName, armor.getName());
        assertEquals(armorWeight, armor.getWeight());
        assertEquals(armorRating, armor.getArmorRating());
    }
}