package edu.technopolis.homework.pokemon;

/**
 * Created by sania_000 on 07.11.2016.
 */
public class Training {
    static Attack[] attacks = {new Attack("Spark", 100, 50), new Attack("Thunder", 102, 40), new Attack("Water Gun", 60, 20), new Attack("Psychic", 120, 100)};
    static Protection[] protections = {new Protection("ProSpark", 70, 50), new Protection("Thunder Punch", 60, 33), new Protection("Confusion", 78, 34), new Protection("ProPsychic", 55, 33)};
    static int attackIndex = 0;
    static int protectionIndex = 0;

    static void trainAttack(Trainer trainer) {
       if (attackIndex<attacks.length) trainer.trainPokemon(trainer.getPokemons().get(0), attacks[attackIndex++],null);
    }

    static void trainProtection(Trainer trainer){
        if (protectionIndex<protections.length) trainer.trainPokemon(trainer.getPokemons().get(0),null, protections[protectionIndex++]);
    }
}
