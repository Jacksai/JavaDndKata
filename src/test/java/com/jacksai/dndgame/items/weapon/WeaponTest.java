package com.jacksai.dndgame.items.weapon;

import org.junit.Test;

import javax.accessibility.AccessibleTable;

import static org.junit.Assert.*;

public class WeaponTest {

    private final String weaponName = "Epic sword";
    private final Double weaponWeight = 4.0d;
    private final Integer weaponAttack = 2;

    @Test
    public void shouldCreateCorrectWeapon() {
        //Act
        Weapon weapon = new Weapon(weaponName, weaponWeight, weaponAttack);

        //Assert
        assertEquals(weaponName, weapon.getName());
        assertEquals(weaponWeight, weapon.getWeight());
        assertEquals(weaponAttack, weapon.getAttack());
    }

    @Test
    public void shouldSetCurrentWeaponType() {
        //Arrange
        Weapon weapon = new Weapon(weaponName, weaponWeight, weaponAttack);
        WeaponType weaponType = WeaponType.AXE;

        //Act
        weapon.setWeaponType(weaponType);

        //Assert
        assertEquals(weaponType, weapon.getWeaponType());
    }
}