package com.jacksai.dndgame.player.equipment;

import com.jacksai.dndgame.items.Item;

import java.util.HashSet;
import java.util.Set;

public class Inventory {

    private Set<Item> items;

    public Inventory() {
        items = new HashSet<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalWeight() {
        return items.stream()
                .mapToDouble(Item::getWeight)
                .sum();
    }

    public boolean contains(Item item) {
        return items.contains(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
