public class JumpingZombie extends Zombie {

    public JumpingZombie(double health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (level == 1) health += health * 0.3;
        else if (level == 2) health += health * 0.4;
        else if (level == 3) health += health * 0.5;
    }

    @Override
    public void destroyed() {
        health -= health * 0.1; 
        if (health < 0) health = 0;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data:\n" + super.getZombieInfo();
    }
}