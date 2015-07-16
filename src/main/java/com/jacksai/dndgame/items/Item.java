package com.jacksai.dndgame.items;

public class Item {

    private static String name;
    private static Double weight;

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
