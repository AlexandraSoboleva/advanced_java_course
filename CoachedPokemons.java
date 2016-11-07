package edu.technopolis.homework.pokemon;

/**
 * Created by sania_000 on 07.11.2016.
 */
public class CoachedPokemons {
    static Pokemon[] pokemons = {new Pokemon("RAICHU", 2000), new Pokemon("SLOWBRO", 2001)};
    static int pokemonIndex = 0;

    static void coach(Trainer trainer) {
        if (pokemonIndex < pokemons.length) trainer.coachPokemon(pokemons[pokemonIndex++]);
    }
}
