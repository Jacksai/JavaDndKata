package com.jacksai.dndgame.player;


public class Player {

    private String name;
    private Alignment playerNature;

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

    private Player(PlayerBuilder builder) {
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
    }

    public int getHealth() {
        return health.getHealth();
    }

    public int getArmorClass() {
        return armorClass.getArmorClass();
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

    public enum Alignment {
        GOOD,
        EVIL,
        BAD
    }

    //Builder
    public static class PlayerBuilder {

        //Required fields
        private final String name;
        private final Alignment playerNature;

        //Optional fields
        private Statistic strength = new Statistic();
        private Statistic dexterity = new Statistic();
        private Statistic constitution = new Statistic();
        private Statistic wisdom = new Statistic();
        private Statistic intelligence = new Statistic();
        private Statistic charisma = new Statistic();

        public PlayerBuilder(String name, Alignment playerNature) {
            this.name = name;
            this.playerNature = playerNature;
        }

        public PlayerBuilder strength(int value) {
            this.strength = new Statistic(value); return this;
        }

        public PlayerBuilder dexterity(int value) {
            this.dexterity = new Statistic(value); return this;
        }

        public PlayerBuilder constitution(int value) {
            this.constitution = new Statistic(value); return this;
        }

        public PlayerBuilder wisdom(int value) {
            this.wisdom = new Statistic(value); return this;
        }

        public PlayerBuilder intelligence(int value) {
            this.intelligence = new Statistic(value); return this;
        }

        public PlayerBuilder charisma(int value) {
            this.charisma = new Statistic(value); return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
