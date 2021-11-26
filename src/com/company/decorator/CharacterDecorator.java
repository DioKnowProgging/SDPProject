package com.company.decorator;

import com.company.Character;

public class CharacterDecorator implements Character {

    private Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }


    @Override
    public String doAnything() {
        return character.doAnything();
    }
}
