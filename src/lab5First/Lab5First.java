package lab5First;

public class Lab5First {
    public static void main(String[] args) {
        Engine[] engines = new Engine[10];

        engines[0] = new FerrariEngine(6.0, 6, 250.0);
        engines[1] = new FerrariEngine(4.5, 6, 300.0);
        engines[2] = new FerrariEngine(5.5, 10, 320.0);
        engines[3] = new FerrariEngine(5.3, 4, 440.0);
        engines[4] = new FerrariEngine(4.2, 6, 350.0);

        engines[5] = new RenaultEngine(3.0, 4, 200.0, 50.0);
        engines[6] = new RenaultEngine(3.8, 4, 180.0, 45.0);
        engines[7] = new RenaultEngine(4.5, 4, 220.0, 60.0);
        engines[8] = new RenaultEngine(2.6, 5, 200.0, 40.0);
        engines[9] = new RenaultEngine(2.6, 5, 170.0, 55.0);

        for (Engine engine : engines) {
            System.out.println(engine.getMaxSpeed());
        }
    }
}
