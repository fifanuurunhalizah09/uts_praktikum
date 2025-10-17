public class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        strength -= 36;
        if (strength < 0) strength = 0;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}
