package lab5First;

abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    Engine() {}
    Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    public abstract double efficiency();

    public abstract double throttleEnergy();

    public abstract double breakEnergy();

    public double getMaxSpeed() {
        return (throttleEnergy() - breakEnergy()) * efficiency();
    }
}
