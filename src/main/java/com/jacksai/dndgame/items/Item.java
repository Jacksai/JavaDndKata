package com.jacksai.dndgame.items;

public class Item {

    private final String name;
    private final Double weight;

    public Item(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
