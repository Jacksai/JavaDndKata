package com.jacksai.dndgame.items.armor;

import com.jacksai.dndgame.items.Item;

public class Armor extends Item {

    private final Integer armorRating;

    public Armor(String armorName, Double armorWeight, Integer armorRating) {
        super(armorName, armorWeight);
        this.armorRating  = armorRating;
    }

    public Integer getArmorRating() {
        return armorRating;
    }
}
