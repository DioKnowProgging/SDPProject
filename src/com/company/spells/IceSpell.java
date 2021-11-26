package com.company.spells;

import com.company.Spell;

public class IceSpell implements Spell {
    @Override
    public String cast() {
        return "Casting Ice Blast...";
    }
}
