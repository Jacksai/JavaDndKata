package com.jacksai.dndgame.items.armor;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArmorTest {

    private static String DEFAULT_ARMOR_NAME = "ARMOR NAME";
    private static Double DEFAULT_ARMOR_WEIGHT = 10.3d;
    private static Integer DEFAULT_ARMOR_RATING = 3;

    @Test
    public void shouldCreateCorrectArmor() {

        //Act
        Armor armor = new Armor(DEFAULT_ARMOR_NAME, DEFAULT_ARMOR_WEIGHT, DEFAULT_ARMOR_RATING);

        //Assert
        assertEquals(DEFAULT_ARMOR_NAME, armor.getName());
        assertEquals(DEFAULT_ARMOR_WEIGHT, armor.getWeight());
        assertEquals(DEFAULT_ARMOR_RATING, armor.getArmorRating());
    }
}