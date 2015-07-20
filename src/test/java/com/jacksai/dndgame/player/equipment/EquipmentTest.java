package com.jacksai.dndgame.player.equipment;

import com.jacksai.dndgame.items.armor.Armor;
import com.jacksai.dndgame.items.armor.ArmorType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class EquipmentTest {

    private final String defaultItemName = "ITEM_NAME";
    private final Double defaultItemWeight = 1.0;

    private Inventory inventory;
    private Equipment equipment;

    @Before
    public void initTest() {
         inventory = new Inventory();
         equipment = new Equipment(inventory);
    }


    @Test(expected = NotInInventoryException.class)
    public void shouldThrowNotInInventoryExceptionWhenTryingToEquipSomethingNotInInventory() throws Exception{
        //Arrange
        Armor armor = new Armor(defaultItemName, defaultItemWeight,1);

        //Act
        equipment.setTorsoArmor(armor);
    }

    @Test
    public void shouldEquipCorrectlyWhenProperArmor() throws Exception{
        //Arrange
        Armor headArmor = new Armor(defaultItemName, defaultItemWeight, 1);
        headArmor.setArmorType(ArmorType.HELMET);
        inventory.addItem(headArmor);

        //Act
        equipment.setHeadArmor(headArmor);

        //Assert
        assertEquals(headArmor, equipment.getHeadArmor());
    }

    @Test
    public void shouldFailToEquipWhenEquippingWrongArmorOnHead() throws Exception {
        //Arrange
        Armor wrongArmor = new Armor(defaultItemName, defaultItemWeight, 1);
        wrongArmor.setArmorType(ArmorType.TORSO);
        inventory.addItem(wrongArmor);

        //Act
        equipment.setHeadArmor(wrongArmor);

        //Assert
        assertNotEquals(equipment.getHeadArmor(), wrongArmor);
    }

    @Test
    public void shouldFailToEquipWhenEquippingWrongArmorOnTorso() throws Exception{
        //Arrange
        Armor wrongArmor = new Armor(defaultItemName, defaultItemWeight, 1);
        wrongArmor.setArmorType(ArmorType.HELMET);
        inventory.addItem(wrongArmor);

        //Act
        equipment.setTorsoArmor(wrongArmor);

        //Assert
        assertNotEquals(equipment.getTorsoArmor(), wrongArmor);
    }

    @Test
    public void shouldFailToEquipWhenEquippingWrongArmorOnBoots() throws Exception{
        //Arrange
        Armor wrongArmor = new Armor(defaultItemName, defaultItemWeight, 1);
        wrongArmor.setArmorType(ArmorType.HELMET);
        inventory.addItem(wrongArmor);

        //Act
        equipment.setBootsArmor(wrongArmor);

        //Assert
        assertNotEquals(equipment.getBootsArmor(), wrongArmor);
    }
}