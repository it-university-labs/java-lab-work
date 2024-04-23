package lab6.fifth;

public class Worker {
    private String fullName;
    private double energy;
    private double power;
    private double efficiency;

    protected Worker(){}

    public Worker(String fullName, double energy, double power, double efficiency) {
        this.fullName = fullName;
        this.energy = energy;
        this.power = power;
        this.efficiency = efficiency;
    }

    public String getFullName() {
        return fullName;
    }

    public double getEnergy() {
        return energy;
    }

    public double getPower() {
        return power;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", energy=" + energy +
                ", power=" + power +
                ", efficiency=" + efficiency +
                '}';
    }

    public double toWork(int time) {
        double workDone = 0;
        for (int i = 0; i < time; i++) {
            double hourlyWork = (power * efficiency);
            energy -= hourlyWork;
            if (energy <= 0) {
                break;
            }
            workDone += hourlyWork;
        }
        return workDone;
    }
}

class Programmer extends Worker {
    private double moralMotivation;

    public Programmer() {
        super();
        this.moralMotivation = 1.0;
    }

    public Programmer(String fullName, double energy, double power, double efficiency, double moralMotivation) {
        super(fullName, energy, power, efficiency);
        this.moralMotivation = moralMotivation;
    }

    public double getMoralMotivation() {
        return moralMotivation;
    }

    public void setMoralMotivation(double moralMotivation) {
        this.moralMotivation = moralMotivation;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "fullName='" + getFullName() + '\'' +
                ", energy=" + getEnergy() +
                ", power=" + getPower() +
                ", efficiency=" + getEfficiency() +
                ", moralMotivation=" + moralMotivation +
                '}';
    }

    @Override
    public double toWork(int time) {
        return super.toWork(time) * moralMotivation;
    }
}
