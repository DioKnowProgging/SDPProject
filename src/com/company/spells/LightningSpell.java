package com.company.spells;

import com.company.Spell;

public class LightningSpell implements Spell {
    @Override
    public String cast() {
        return "Casting ThunderStrike...";
    }
}
