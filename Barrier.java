public class Barrier extends Destroyable {
    private double strength;

    public Barrier(double strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= strength * 0.4; // hancur 40% tiap serangan
        if (strength < 0) strength = 0;
    }

    public double getStrength() {
        return strength;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}
