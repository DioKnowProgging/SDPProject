package com.company.decorator;

import com.company.Character;

public class SwordsmanDecorator extends CharacterDecorator{

    public SwordsmanDecorator(Character character) {
        super(character);
    }

    String bladeStorm(){
        return "Attacks with sword for 180 degree";
    }

    @Override
    public String doAnything(){
        return super.doAnything() + bladeStorm();
    }
}
