package edu.technopolis.homework.pokemon;


public class Protection {
    private String command;
    private int protectionDam;//число едениц, которые вычитаются из урона атаки
    private int needEnergy;

    public Protection(String command, int protectionDam, int energy) {
        this.command = command;
        this.protectionDam = protectionDam;
        this.needEnergy=energy;
    }

    public String getCommand() {
        return command;
    }

    public int getProtectionDam() {
        return protectionDam;
    }

    public int getNeedEnergy() {
        return needEnergy;
    }
}
