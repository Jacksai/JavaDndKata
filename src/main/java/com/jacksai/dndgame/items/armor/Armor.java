package com.jacksai.dndgame.items.armor;

import com.jacksai.dndgame.items.Inventorable;
import com.jacksai.dndgame.items.Item;

public class Armor implements Inventorable {

    private final Item item;
    private final Integer armorRating;
    private ArmorType armorType;

    public Armor(String armorName, Double armorWeight, Integer armorRating) {
        this.item = new Item(armorName, armorWeight);
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

    @Override
    public Double getWeight() {
        return item.getWeight();
    }

    @Override
    public String getName() {
        return item.getName();
    }
}
