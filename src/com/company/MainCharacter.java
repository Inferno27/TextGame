package com.company;

/**
 * Created by jammis01 on 6/24/2016.
 */
public class MainCharacter {

    private String name;
    private int health;
    private int damage;
    private int defense;
   public int level;
    private int exp;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
