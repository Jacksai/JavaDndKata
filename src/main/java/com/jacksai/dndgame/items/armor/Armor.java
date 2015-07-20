package com.jacksai.dndgame.items.armor;

import com.jacksai.dndgame.items.Item;

public class Armor extends Item {

    private Integer armorRating;
    private ArmorType armorType;

    public Armor(String armorName, Double armorWeight, Integer armorRating) {
        super(armorName, armorWeight);
        this.armorRating  = armorRating;
    }

    public Integer getArmorRating() {
        return armorRating;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }
}
