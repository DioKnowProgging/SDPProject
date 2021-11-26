package com.company.decorator;

import com.company.Character;

public class AssassinDecorator extends CharacterDecorator{
    public AssassinDecorator(Character character) {
        super(character);
    }

    String silentMurder(){
        return "Kills instantly low HP character";
    }

    @Override
    public String doAnything(){
        return super.doAnything() + silentMurder();
    }
}
