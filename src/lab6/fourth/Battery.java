package lab6.fourth;

public abstract class Battery {
    abstract double getPower();
    abstract double getLifeTime();
    abstract double getEnergy();
}

class ToshibaBattery extends Battery {
    double voltage;
    double currency;
    double energy;
    double extraEnergy;

    ToshibaBattery(){}

    public ToshibaBattery(double voltage, double currency, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    public ToshibaBattery(double v, double v1, int i) {
        super();
    }

    @Override
    double getPower() {
        return voltage * currency;
    }

    @Override
    double getLifeTime() {
        return energy / getPower();
    }

    @Override
    double getEnergy() {
        return energy;
    }
}

class DuracellBattery extends Battery {
    double voltage;
    double currency;
    double energy;
    double InternalVoltage;

    DuracellBattery(){}

    public DuracellBattery(double voltage, double currency, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        InternalVoltage = internalVoltage;
    }

    public DuracellBattery(double v, double v1, int i) {
        super();
    }

    @Override
    double getPower() {
        return voltage * currency;
    }

    @Override
    double getLifeTime() {
        return energy / getPower();
    }

    @Override
    double getEnergy() {
        return energy;
    }
}

class FlashLight {
    Battery batteries[];

    public FlashLight(Battery batteries) {
        this.batteries = new Battery[]{batteries};
    }

    public Battery[] getBatteries() {
        return batteries;
    }

    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }

    public double getTotalPower() {
        double totalPower = 0;
        for(Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (Battery battery : batteries) {
            totalEnergy += battery.getEnergy();
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        double totalPower = getTotalPower();
        double totalEnergy = getTotalEnergy();
        if (totalPower == 0) {
            return 0;
        }
        return totalEnergy / totalPower;
    }
}
