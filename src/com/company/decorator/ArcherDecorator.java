package com.company.decorator;

import com.company.Character;

public class ArcherDecorator extends CharacterDecorator{
    public ArcherDecorator(Character character) {
        super(character);
    }

    String rainOfArrows(){
        return "Shots as Fast as possible";
    }

    @Override
    public String doAnything(){
        return super.doAnything() + rainOfArrows();
    }
}
