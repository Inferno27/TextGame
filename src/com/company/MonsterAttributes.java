package com.company;

/**
 * Created by jamtah01 on 6/24/2016.
 */
public class MonsterAttributes {

    private String type;
    private int health;
    private int attack;
    private int defense;
    private int exp;

    public MonsterAttributes(String type,int attack, int health, int defense,int exp) {
        this.type = type;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.exp = exp;
    }
}
