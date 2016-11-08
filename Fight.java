package edu.technopolis.homework.pokemon;

/**
 * Created by sania_000 on 04.11.2016.
 */
public class Fight {
    private void damage(int dam1, int dam2, Pokemon pokemon1, Pokemon pokemon2){
        if ((dam1>=0) && (dam2>=0)){
            System.out.println("Оба покемона нанесли удар");
            pokemon1.damage(dam2);
            pokemon2.damage(dam1);
        } else if((dam1>=0) && (dam2<0)){
            System.out.println("Покемон "+pokemon1.getName()+" нанес удар, а покемон "+pokemon2.getName()+" поставил защиту");
            if(dam1+dam2>0) pokemon2.damage(dam1+dam2);
            else pokemon2.damage(0);
        }else if((dam1<0) && (dam2>=0)){
            System.out.println("Покемон "+pokemon2.getName()+" нанес удар, а покемон "+pokemon1.getName()+" поставил защиту");
            if(dam1+dam2>0) pokemon1.damage(dam1+dam2);
            else pokemon1.damage(0);
        }else if((dam1<0) && (dam2<0)){
            System.out.println("Оба покемона поставили защиту");
        }
    }

    public int fight(Trainer trainer1, Trainer trainer2, Pokemon pokemon1, Pokemon pokemon2) {
        while ((pokemon1.getPower() > 0) && (pokemon2.getPower() > 0)){
            int damage1;
            int damage2;
            damage2=trainer1.giveCommand(pokemon1);
            damage1=trainer2.giveCommand(pokemon2);
            damage(damage1,damage2,pokemon1,pokemon2);
            if((!pokemon1.canDo()) && (!pokemon2.canDo())) {
                return 0;
            }
            System.out.println("Pokemon1: "+pokemon1.getName()+" "+pokemon1.getPower()+" "+pokemon1.getEnergy());
            System.out.println("Pokemon2: "+pokemon2.getName()+" "+pokemon2.getPower()+" "+pokemon2.getEnergy());
        }

        if (pokemon1.getPower() < 0 && pokemon2.getPower() < 0 ) return 3;
        else if(pokemon1.getPower() > 0 )  return 1;
        else return 2;

    }
}
