package lab6.seventh;

public class Car {
    private String model;
    private double fuelEnergy;
    private double power;

    public Car() {
        this.model = "";
        this.fuelEnergy = 0;
        this.power = 0;
    }

    public Car(String model, double fuelEnergy, double power) {
        this.model = model;
        this.fuelEnergy = fuelEnergy;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public double getFuelEnergy() {
        return fuelEnergy;
    }

    public double getPower() {
        return power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelEnergy(double fuelEnergy) {
        this.fuelEnergy = fuelEnergy;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuelEnergy=" + fuelEnergy +
                ", power=" + power +
                '}';
    }

    public double ride(int time) {
        return fuelEnergy * time * power;
    }
}

class Mercedes extends Car {
    private double electricalEnergy;

     public Mercedes() {
        super();
        this.electricalEnergy = 0.0;
    }

    public Mercedes(String model, double fuelEnergy, double power, double electricalEnergy) {
        super(model, fuelEnergy, power);
        this.electricalEnergy = electricalEnergy;
    }

    public double getElectricalEnergy() {
        return electricalEnergy;
    }

    public void setElectricalEnergy(double electricalEnergy) {
        this.electricalEnergy = electricalEnergy;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + getModel() + '\'' +
                ", fuelEnergy=" + getFuelEnergy() +
                ", power=" + getPower() +
                ", electricalEnergy=" + electricalEnergy +
                '}';
    }

    @Override
    public double ride(int time) {
        return (getFuelEnergy() + electricalEnergy) * time * getPower();
    }
}

class Hammer extends Car {
    private double extraPower;

    public Hammer() {
        super();
        this.extraPower = 0;
    }

    public Hammer(String model, double fuelEnergy, double power, double extraPower) {
        super(model, fuelEnergy, power);
        this.extraPower = extraPower;
    }

    public double getExtraPower() {
        return extraPower;
    }

    public void setExtraPower(double extraPower) {
        this.extraPower = extraPower;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "model='" + getModel() + '\'' +
                ", fuelEnergy=" + getFuelEnergy() +
                ", power=" + getPower() +
                ", extraPower=" + extraPower +
                '}';
    }

    @Override
    public double ride(int time) {
        return getFuelEnergy() * time * (getPower() + extraPower);
    }
}
