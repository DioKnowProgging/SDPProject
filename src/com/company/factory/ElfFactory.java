package com.company.factory;

import com.company.Character;
import com.company.CharacterFactory;
import com.company.race.Elf;

public class ElfFactory implements CharacterFactory {

    @Override
    public Character createChar(int health, int attack, int mana, String nickname) {
        return new Elf(health, attack, mana, nickname);
    }
}
