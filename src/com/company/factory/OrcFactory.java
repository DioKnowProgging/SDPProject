package com.company.factory;

import com.company.Character;
import com.company.CharacterFactory;
import com.company.race.Orc;

public class OrcFactory implements CharacterFactory {
    @Override
    public Character createChar(int health, int attack, int mana, String nickname) {
        return new Orc(health, attack, mana, nickname);
    }
}
