package com.company;

import com.company.decorator.ArcherDecorator;
import com.company.decorator.AssassinDecorator;
import com.company.decorator.MageDecorator;
import com.company.decorator.SwordsmanDecorator;
import com.company.factory.ElfFactory;
import com.company.factory.HumanFactory;
import com.company.factory.OrcFactory;
import com.company.spells.FireSpell;
import com.company.spells.IceSpell;
import com.company.spells.LightningSpell;
import com.company.spells.WindSpell;

import java.rmi.MarshalException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        //Character character = characterFactory.createChar(hpInput, attInput, manaInput, nickInput);

        //character = new ArcherDecorator(new CharacterWithClass());

        //System.out.println((character.doAnything()));
        //System.out.println(character.toString());
        System.out.println("Hello, welcome to Character Creator App! \n" +
                "Please choose your race: \n" +
                "1.Elf \n" +
                "2.Human \n" +
                "3.Orc \n" +
                "Also input your stats like HP, Attack, Mana, Nickname");
        int raceChoice = scan.nextInt();
        int hpInput = scan.nextInt();
        int attInput = scan.nextInt();
        int manaInput = scan.nextInt();
        String nickInput = scan.next();

        System.out.println("Okay, let's choose your FIRST class \n" +
                "1.Swordsman \n" +
                "2.Archer \n" +
                "3.Assassin \n");

        int classChoice = scan.nextInt();
        System.out.println("Let's choose your Element in magic \n"  +
                "1.Fire \n" +
                "2.Ice \n" +
                "3.Lightning \n" +
                "4.Wind \n");

        int elemChoice = scan.nextInt();

        switch (raceChoice){
            case 1:
                CharacterFactory characterFactory = new ElfFactory();
                Character character = characterFactory.createChar(hpInput, attInput, manaInput, nickInput);
                System.out.println(character.toString());
                System.out.println(character.doAnything());
                break;
            case 2:
                characterFactory = new HumanFactory();
                character = characterFactory.createChar(hpInput, attInput, manaInput, nickInput);
                System.out.println(character.toString());
                System.out.println(character.doAnything());
                break;
            case 3:
                characterFactory = new OrcFactory();
                character = characterFactory.createChar(hpInput, attInput, manaInput, nickInput);
                System.out.println(character.toString());
                System.out.println(character.doAnything());
                break;
        }

        switch (classChoice) {
            case 1:
                switch (elemChoice) {
                    case 1:
                        Character character = new MageDecorator(new SwordsmanDecorator(new CharacterWithClass()), new FireSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 2:
                        character = new MageDecorator(new SwordsmanDecorator(new CharacterWithClass()), new IceSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 3:
                        character = new MageDecorator(new SwordsmanDecorator(new CharacterWithClass()), new LightningSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 4:
                        character = new MageDecorator(new SwordsmanDecorator(new CharacterWithClass()), new WindSpell());
                        System.out.println(character.doAnything());
                        break;
                }
                break;
            case 2:
                switch (elemChoice) {
                    case 1:
                        Character character = new MageDecorator(new ArcherDecorator(new CharacterWithClass()), new FireSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 2:
                        character = new MageDecorator(new ArcherDecorator(new CharacterWithClass()), new IceSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 3:
                        character = new MageDecorator(new ArcherDecorator(new CharacterWithClass()), new LightningSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 4:
                        character = new MageDecorator(new ArcherDecorator(new CharacterWithClass()), new WindSpell());
                        System.out.println(character.doAnything());
                        break;
                }
                break;
            case 3:
                switch (elemChoice) {
                    case 1:
                        Character character = new MageDecorator(new AssassinDecorator(new CharacterWithClass()), new FireSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 2:
                        character = new MageDecorator(new AssassinDecorator(new CharacterWithClass()), new IceSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 3:
                        character = new MageDecorator(new AssassinDecorator(new CharacterWithClass()), new LightningSpell());
                        System.out.println(character.doAnything());
                        break;
                    case 4:
                        character = new MageDecorator(new AssassinDecorator(new CharacterWithClass()), new WindSpell());
                        System.out.println(character.doAnything());
                        break;
                }
                break;
        }
    }
}
