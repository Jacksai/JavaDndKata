package com.jacksai.dndgame.player;


import com.jacksai.dndgame.items.Inventorable;
import com.jacksai.dndgame.items.Item;
import com.jacksai.dndgame.player.equipment.Equipment;
import com.jacksai.dndgame.player.equipment.Inventory;

public class Player {

    private String name;
    private PlayerNature playerNature;

    //Statistics
    private Statistic strength;
    private Statistic dexterity;
    private Statistic constitution;
    private Statistic wisdom;
    private Statistic intelligence;
    private Statistic charisma;

    //Attributes
    private ArmorClass armorClass;
    private Health health;

    private Inventory inventory;
    private Equipment equipment;

    private Player(Builder builder) {
        this.name = builder.name;
        this.playerNature = builder.playerNature;
        this.strength = builder.strength;
        this.dexterity = builder.dexterity;
        this.constitution = builder.constitution;
        this.wisdom = builder.wisdom;
        this.intelligence = builder.intelligence;
        this.charisma = builder.charisma;

        this.armorClass = new ArmorClass();
        this.health  = new Health();
        this.inventory = new Inventory();
        this.equipment = new Equipment(inventory);
    }

    public void addItem(Inventorable item) {
        inventory.addItem(item);
    }

    public int getHealth() {
        return health.getHealth();
    }

    public int getArmorClass() {
        return armorClass.getArmorClass();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Statistic getStrength() {
        return strength;
    }

    public Statistic getDexterity() {
        return dexterity;
    }

    public Statistic getConstitution() {
        return constitution;
    }

    public Statistic getWisdom() {
        return wisdom;
    }

    public Statistic getIntelligence() {
        return intelligence;
    }

    public Statistic getCharisma() {
        return charisma;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    //Attribute classes
    class ArmorClass {

        private static final int DEFAULT_ARMOR_CLASS = 10;
        private final int armorClass;

        public ArmorClass() {
            this(DEFAULT_ARMOR_CLASS);
        }

        public ArmorClass(int armorClass) {
            this.armorClass = armorClass;
        }

        public int getArmorClass() {
            return armorClass + dexterity.getModifier();
        }

        public int getValue() {
            return armorClass;
        }

    }

    class Health {

        private static final int DEFAULT_HEALTH = 5;

        private final
        int value;

        public Health() {
            this(DEFAULT_HEALTH);
        }

        public Health(int value) {
            this.value = value;
        }

        public int getHealth() {
            return this.value + constitution.getModifier() > 0 ? this.value + constitution.getModifier() : 1;
        }

        public int getValue() {
            return this.value;
        }

    }

    public enum PlayerNature {
        GOOD,
        NEUTRAL,
        EVIL
    }

    //Builder
    public static class Builder {

        //Required fields
        private final String name;

        //Optional fields
        private Statistic strength = new Statistic();
        private Statistic dexterity = new Statistic();
        private Statistic constitution = new Statistic();
        private Statistic wisdom = new Statistic();
        private Statistic intelligence = new Statistic();
        private Statistic charisma = new Statistic();
        private PlayerNature playerNature = PlayerNature.NEUTRAL;

        public Builder(String name) {
            this.name = name;
        }

        public Builder alignment(PlayerNature playerNature) {
            this.playerNature = playerNature; return this;
        }

        public Builder strength(int value) {
            this.strength = new Statistic(value); return this;
        }

        public Builder dexterity(int value) {
            this.dexterity = new Statistic(value); return this;
        }

        public Builder constitution(int value) {
            this.constitution = new Statistic(value); return this;
        }

        public Builder wisdom(int value) {
            this.wisdom = new Statistic(value); return this;
        }

        public Builder intelligence(int value) {
            this.intelligence = new Statistic(value); return this;
        }

        public Builder charisma(int value) {
            this.charisma = new Statistic(value); return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
