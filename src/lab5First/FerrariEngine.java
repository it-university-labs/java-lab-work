package lab5First;

class FerrariEngine extends Engine {
    public FerrariEngine() {
        super();
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    public double efficiency() {
        return 0.25;
    }

    @Override
    public double throttleEnergy() {
        return engineVolume * cylinderAmount * 100;
    }

    @Override
    public double breakEnergy() {
        return engineWeight * 2;
    }
}
