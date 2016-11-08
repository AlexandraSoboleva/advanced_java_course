package edu.technopolis.homework.pokemon;


public class CoachedPokemons {
    private static Pokemon[] pokemons = {new Pokemon("RAICHU", 2000), new Pokemon("SLOWBRO", 2001)};
    private static int pokemonIndex = 0;

   public static void coach(Trainer trainer) {
        if (pokemonIndex < pokemons.length) trainer.coachPokemon(pokemons[pokemonIndex++]);
    }
}
