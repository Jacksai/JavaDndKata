package com.jacksai.dndgame.items.weapon;

import com.jacksai.dndgame.items.Item;

public class Weapon extends Item {

    private final Integer attack;

    public Weapon(String name, Double weight, Integer attack) {
        super(name, weight);
        this.attack = attack;
    }

    public Integer getAttack() {
        return attack;
    }
}
