package com.jacksai.dndgame.items.weapon;

import com.jacksai.dndgame.items.Item;

public class Weapon extends Item {

    private final Integer attack;
    private WeaponType weaponType;

    public Weapon(String name, Double weight, Integer attack) {
        super(name, weight);
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
}
