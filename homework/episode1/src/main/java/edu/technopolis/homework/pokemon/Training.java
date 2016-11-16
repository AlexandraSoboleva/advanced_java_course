package main.java.edu.technopolis.homework.pokemon;


public class Training {
    private  static Attack[] attacks = {new Attack("Spark", 100, 50), new Attack("Thunder", 102, 40), new Attack("Water Gun", 60, 20), new Attack("Psychic", 120, 100)};//все атаки во вселенной
    private static Protection[] protections = {new Protection("ProSpark", 70, 50), new Protection("Thunder Punch", 60, 33), new Protection("Confusion", 78, 34), new Protection("ProPsychic", 55, 33)};//все защиты во вселенной
    private static int attackIndex = 0;
    private static int protectionIndex = 0;

    public static void trainAttack(Trainer trainer) {
       if (attackIndex<attacks.length) trainer.trainPokemon(trainer.getPokemons().get(0), attacks[attackIndex++],null);
    }

    public static void trainProtection(Trainer trainer){
        if (protectionIndex<protections.length) trainer.trainPokemon(trainer.getPokemons().get(0),null, protections[protectionIndex++]);
    }
}
