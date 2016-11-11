package pokemon;


public class Attack {
    private String command; //название аттаки
    private int dam;
    private int needEnergy;

    public Attack(String command, int dam, int energy) {
        this.command = command;
        this.dam = dam;
        this.needEnergy=energy;
    }

    public String getCommand() {
        return command;
    }

    public int getDam() {
        return dam;
    }

    public int getNeedEnergy() {
        return needEnergy;
    }
}
