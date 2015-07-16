package com.jacksai.dndgame.items.weapon;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    @Test
    public void shouldCreateCorrectWeapon() {
        //Arrange
        String weaponName = "Epic sword";
        Double weaponWeight = 4.0d;
        Integer weaponAttack = 2;

        //Act
        Weapon weapon = new Weapon(weaponName, weaponWeight, weaponAttack);

        //Assert
        assertEquals(weaponName, weapon.getName());
        assertEquals(weaponWeight, weapon.getWeight());
        assertEquals(weaponAttack, weapon.getAttack());
    }
}