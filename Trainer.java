package edu.technopolis.homework.pokemon;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sania_000 on 04.11.2016.
 */
public class Trainer {
    private ArrayList<Pokemon> pokemons; //коллекция покемонов тренера

    public Trainer() {
        this.pokemons = new ArrayList<Pokemon>();
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void coachPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public void trainPokemon(Pokemon pokemon, Attack attack, Protection protection){
        if(attack!=null) pokemon.addAttack(attack);
        if (protection!=null) pokemon.addProtection(protection);
    }

    public int giveCommand(Pokemon pokemon){
        Random randNumber = new Random();
        int damage=0;
        int numAttacks=pokemon.getAttacks().size();
        int numProtections=pokemon.getProtections().size();
        int icom = randNumber.nextInt(numAttacks+numProtections-1);
        if(icom<numAttacks) {damage=pokemon.execCommand(pokemon.getAttacks().get(icom).getCommand());}
        else {
            icom-=numAttacks;
            damage=pokemon.execCommand(pokemon.getProtections().get(icom).getCommand());
        }
        return damage;
    }
}
