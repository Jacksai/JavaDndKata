package com.jacksai.dndgame.player.equipment;

import com.jacksai.dndgame.items.Inventorable;
import com.jacksai.dndgame.items.Item;
import com.jacksai.dndgame.items.armor.Armor;
import com.jacksai.dndgame.items.armor.ArmorType;
import com.jacksai.dndgame.items.weapon.Weapon;

public class Equipment {


    private Inventory inventory;

    private Armor headArmor;
    private Armor torsoArmor;
    private Armor bootsArmor;

    private Weapon rightHandWeapon;
    private Weapon leftHandWeapon;

    public Equipment(Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean isInInventory(Inventorable item) {
        return inventory.contains(item);
    }

    public Armor getHeadArmor() {
        return headArmor;
    }

    public void setHeadArmor(Armor headArmor) throws NotInInventoryException {
        if(isInInventory(headArmor)) {
            if(headArmor.getArmorType().equals(ArmorType.HELMET)) {
                this.headArmor = headArmor;
            }
        } else {
            throw new NotInInventoryException();
        }

    }

    public Armor getTorsoArmor() {
        return torsoArmor;
    }

    public void setTorsoArmor(Armor torsoArmor) throws NotInInventoryException {
        if(isInInventory(torsoArmor)) {
            if(torsoArmor.getArmorType().equals(ArmorType.TORSO))
                this.torsoArmor = torsoArmor;
        } else {
            throw new NotInInventoryException();
        }

    }

    public Armor getBootsArmor() {
        return bootsArmor;
    }

    public void setBootsArmor(Armor bootsArmor) throws NotInInventoryException {
        if(isInInventory(bootsArmor)) {
            if(bootsArmor.getArmorType().equals(ArmorType.BOOTS)) {
                this.bootsArmor = bootsArmor;
            }
        } else {
            throw new NotInInventoryException();
        }

    }

    public Weapon getRightHandWeapon() {
        return rightHandWeapon;
    }

    public void setRightHandWeapon(Weapon rightHandWeapon) throws NotInInventoryException {
        if(isInInventory(rightHandWeapon)) {
            this.rightHandWeapon = rightHandWeapon;
        } else {
            throw new NotInInventoryException();
        }

    }

    public Weapon getLeftHandWeapon() {
        return leftHandWeapon;
    }

    public void setLeftHandWeapon(Weapon leftHandWeapon) throws NotInInventoryException {
        if(isInInventory(leftHandWeapon)) {
            this.leftHandWeapon = leftHandWeapon;
        } else {
            throw new NotInInventoryException();
        }

    }
}

class NotInInventoryException extends Exception {
}
