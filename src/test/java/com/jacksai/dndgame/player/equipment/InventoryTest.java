package com.jacksai.dndgame.player.equipment;

import com.jacksai.dndgame.items.Item;
import com.jacksai.dndgame.items.armor.Armor;
import com.jacksai.dndgame.items.weapon.Weapon;
import com.jacksai.dndgame.player.equipment.Inventory;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    @Test
    public void shouldBeEmptyOnStart() {
        //Arrange
        Inventory inventory = new Inventory();

        //Assert
        assertEquals(0.0, inventory.getTotalWeight(), 0.001);
    }

    @Test
    public void shouldCorrectlyAddItem() {
        //Arrange
        Item item = new Weapon("NAME", 1.0d, 1);
        Inventory inventory = new Inventory();

        //Act
        inventory.addItem(item);

        //Assert
        assertTrue(inventory.contains(item));
    }

    @Test
    public void shouldCorrectlyRemoveItem() {
        //Arrange
        Item item = new Weapon("NAME", 1.0d, 1);
        Inventory inventory = new Inventory();
        inventory.addItem(item);

        //Act
        inventory.removeItem(item);

        //Assert
        assertFalse(inventory.contains(item));
    }

    @Test
    public void shouldCorrectlyCalculateWeight() {
        //Arrange
        double weaponWeight = 1.4;
        double armorWeight = 2.2;

        Item weapon = new Weapon("WeaponName", weaponWeight, 1);
        Item armor = new Armor("ArmorName", armorWeight, 1);

        Inventory inventory = new Inventory();

        //Act
        inventory.addItem(armor);
        inventory.addItem(weapon);

        //Assert
        assertEquals(weaponWeight + armorWeight, inventory.getTotalWeight(), 0.001);
    }
}