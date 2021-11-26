package com.company.race;

import com.company.Character;

public class Orc implements Character {

    private int Health;
    private int Attack;
    private int Mana;
    private String Nickname;

    public Orc(int health, int attack, int mana, String nickname) {
        Health = health;
        Attack = attack;
        Mana = mana;
        Nickname = nickname;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    @Override
    public String doAnything() {
        return "I'm Orc";
    }

    @Override
    public String toString() {
        return "Elf{" +
                "Health=" + Health +
                ", Attack=" + Attack +
                ", Mana=" + Mana +
                ", Nickname='" + Nickname + '\'' +
                '}';
    }
}

