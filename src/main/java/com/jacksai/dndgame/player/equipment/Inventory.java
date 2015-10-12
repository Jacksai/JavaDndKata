package com.jacksai.dndgame.player.equipment;

import com.jacksai.dndgame.items.Inventorable;
import com.jacksai.dndgame.items.Item;

import java.util.HashSet;
import java.util.Set;

public class Inventory {

    private Set<Inventorable> items;

    public Inventory() {
        items = new HashSet<>();
    }

    public void addItem(Inventorable item) {
        items.add(item);
    }

    public double getTotalWeight() {
        return items.stream()
                .mapToDouble(Inventorable::getWeight)
                .sum();
    }

    public boolean contains(Inventorable item) {
        return items.contains(item);
    }

    public void removeItem(Inventorable item) {
        items.remove(item);
    }
}
