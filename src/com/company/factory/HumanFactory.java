package com.company.factory;

import com.company.Character;
import com.company.CharacterFactory;
import com.company.race.Human;

public class HumanFactory implements CharacterFactory {

    @Override
    public Character createChar(int health, int attack, int mana, String nickname) {
        return new Human(health, attack, mana, nickname);
    }
}
