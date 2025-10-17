public abstract class Zombie extends Destroyable {
    protected double health;
    protected int level;

    public Zombie(double health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    public double getHealth() {
        return health;
    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}