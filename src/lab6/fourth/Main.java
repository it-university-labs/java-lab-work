package lab6.fourth;

public class Main {
    public static void main(String[] args) {
        Battery[] ToshibaBatteries = new Battery[5];
        for (int i = 0; i < 5; i++) {
            ToshibaBatteries[i] = new ToshibaBattery(1.5, 0.8, 100 + i * 20);
        }

        Battery[] DuracellBatteries = new Battery[5];
        for (int i = 0; i < 5; i++) {
            DuracellBatteries[i] = new DuracellBattery(1.5, 0.8, 100 + i * 20);
        }

        FlashLight[] flashlights = new FlashLight[5];
        flashlights[0] = new FlashLight(ToshibaBatteries[0]);
        flashlights[1] = new FlashLight(ToshibaBatteries[1]);
        flashlights[2] = new FlashLight(ToshibaBatteries[2]);
        flashlights[3] = new FlashLight(DuracellBatteries[0]);
        flashlights[4] = new FlashLight(DuracellBatteries[1]);

        System.out.println("Lifetimes of all flashlights:");
        for (int i = 0; i < 5; i++) {
            double lifetime = flashlights[i].getTotalLifeTime();
            System.out.println("Flashlight " + (i + 1) + ": " + lifetime + " hours");
        }

        FlashLight maxLifetimeFlashlight = flashlights[0];
        for (int i = 1; i < 5; i++) {
            if (flashlights[i].getTotalLifeTime() > maxLifetimeFlashlight.getTotalLifeTime()) {
                maxLifetimeFlashlight = flashlights[i];
            }
        }
    }
}
