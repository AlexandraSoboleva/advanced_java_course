package edu.technopolis.homework.pokemon;

import static edu.technopolis.homework.pokemon.CoachedPokemons.coach;
import static edu.technopolis.homework.pokemon.Training.trainAttack;
import static edu.technopolis.homework.pokemon.Training.trainProtection;


public class Main {
    public static void main(String[] args) {

        Trainer Fill = new Trainer();
        Trainer Bill = new Trainer();

        coach(Fill);
        coach(Bill);

        trainAttack(Fill);
        trainAttack(Fill);
        trainAttack(Bill);
        trainAttack(Bill);

        trainProtection(Fill);
        trainProtection(Fill);
        trainProtection(Bill);
        trainProtection(Bill);

        Fight firstFight = new Fight();
        int res = firstFight.fight(Fill, Bill, Fill.getPokemons().get(0), Bill.getPokemons().get(0));
        switch (res) {
            case 0:
                System.out.println("Ничья: оба устали");
                break;
            case 1:
                System.out.println("Победил покемон Filla");
                break;
            case 2:
                System.out.println("Победил покемон Billa");
                break;
            case 3:
                System.out.println("Ничья: у обоих закончились силы");//может никто не победить, но энергия на улары израсходуется
                break;
        }
    }
}
