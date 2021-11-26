package com.company.spells;

import com.company.Spell;

public class WindSpell implements Spell {
    @Override
    public String cast() {
        return "Casting Tornado...";
    }
}
