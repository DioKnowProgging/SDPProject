package com.company.decorator;

import com.company.Character;
import com.company.Spell;

public class MageDecorator extends CharacterDecorator {

    private Spell spell;

    public MageDecorator(Character character, Spell spell) {
        super(character);
        this.spell = spell;
    }

    String castUniqueSpell(){
        return spell.cast();
    }

    @Override
    public String doAnything(){
        return super.doAnything() + castUniqueSpell();
    }
}
