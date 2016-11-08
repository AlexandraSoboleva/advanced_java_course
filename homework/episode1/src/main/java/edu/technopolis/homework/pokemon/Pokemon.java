package edu.technopolis.homework.pokemon;

import java.util.ArrayList;

public class Pokemon {
    private String name;//имя покемона
    private int power; //сила покемона, когда она заканчивается, заканчивается и бой покемонов
    private int energy;//энергия покемона, нужна для совершения атак и защит, если она закончится покемон не сможет нанести удар или защитится
    private ArrayList<Attack> attacks; //набор атак, которые умеет делать покемон
    private ArrayList<Protection> protections; //набор защит, которые умеет делать покемон

    protected Pokemon(String name, int power) {
        this.name = name;
        this.power = power;
        this.energy=10000;
        this.attacks = new ArrayList<Attack>();
        this.protections=new ArrayList<Protection>();
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getPower() {
        return power;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public ArrayList<Protection> getProtections() {
        return protections;
    }

    protected void addAttack(Attack attack) {
        attacks.add(attack);
    }

    protected void addProtection( Protection protection) {
        protections.add(protection);
    }

    protected void damage(int damage) {
        this.power-=damage;
    }

    protected int execCommand( String command){
        for (Attack at:attacks){
            if (at.getCommand()==command){
                if (this.energy>=at.getNeedEnergy()){
                    this.energy-=at.getNeedEnergy();
                    return at.getDam();
                }else{
                    return 0;
                }


            }
        }
       for (Protection pr:protections){
            if (pr.getCommand()==command){
                if(this.energy>=pr.getNeedEnergy()){
                    this.energy-=pr.getNeedEnergy();
                    return -pr.getProtectionDam();
                }

            }else{
                return 0;
            }
        }
        return 0;
    }

    //функция проверяет, может ли покемон ещё совершить атаку или защиту, или у него кончилась энергия
    public boolean canDo(){
        int min=attacks.get(0).getNeedEnergy();
        for (int i=1;i<attacks.size();i++){
            if (min>attacks.get(i).getNeedEnergy()) min=attacks.get(i).getNeedEnergy();
        }
        if (min<this.energy) return true;
        return false;
    }

}
