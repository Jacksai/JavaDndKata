package com.jacksai.dndgame.items.weapon;

import com.jacksai.dndgame.items.Inventorable;
import com.jacksai.dndgame.items.Item;

public class Weapon implements Inventorable {

    private final Integer attack;
    private WeaponType weaponType;
    private final Item item;

    public Weapon(String name, Double weight, Integer attack) {
        this.item = new Item(name, weight);
        this.attack = attack;
    }

    public Integer getAttack() {
        return attack;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
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
