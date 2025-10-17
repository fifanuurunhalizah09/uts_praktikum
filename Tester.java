public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        wz.heal();
        jz.heal();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Serangan ke-" + i + " ===");
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());
            System.out.println();
        }
    }
}