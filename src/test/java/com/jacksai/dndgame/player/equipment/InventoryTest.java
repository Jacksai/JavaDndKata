package com.jacksai.dndgame.player.equipment;

import com.jacksai.dndgame.items.Item;
import com.jacksai.dndgame.items.armor.Armor;
import com.jacksai.dndgame.items.weapon.Weapon;
import com.jacksai.dndgame.player.equipment.Inventory;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    private static final String DEFAULT_ITEM_NAME = "Item Name";

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
        Weapon weapon = new Weapon(DEFAULT_ITEM_NAME, 1.0d, 1);
        Inventory inventory = new Inventory();

        //Act
        inventory.addItem(weapon);

        //Assert
        assertTrue(inventory.contains(weapon));
    }

    @Test
    public void shouldCorrectlyRemoveItem() {
        //Arrange
        Weapon weapon = new Weapon(DEFAULT_ITEM_NAME, 1.0d, 1);
        Inventory inventory = new Inventory();
        inventory.addItem(weapon);

        //Act
        inventory.removeItem(weapon);

        //Assert
        assertFalse(inventory.contains(weapon));
    }

    @Test
    public void shouldCorrectlyCalculateWeight() {
        //Arrange
        double weaponWeight = 1.4;
        double armorWeight = 2.2;

        Weapon weapon = new Weapon(DEFAULT_ITEM_NAME, weaponWeight, 1);
        Armor armor = new Armor(DEFAULT_ITEM_NAME, armorWeight, 1);

        Inventory inventory = new Inventory();

        //Act
        inventory.addItem(armor);
        inventory.addItem(weapon);

        //Assert
        assertEquals(weaponWeight + armorWeight, inventory.getTotalWeight(), 0.001);
    }
}