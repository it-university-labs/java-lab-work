package lab6.sixth;

import lab6.fifth.Worker;

public class Teacher extends Worker {
    private double tiredness;

    public Teacher() {
        super();
        this.tiredness = 0.03;
    }

    public Teacher(String fullName, double energy, double power, double efficiency, double tiredness) {
        super(fullName, energy, power, efficiency);
        this.tiredness = tiredness;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + getFullName() + '\'' +
                ", energy=" + getEnergy() +
                ", power=" + getPower() +
                ", efficiency=" + getEfficiency() +
                ", tiredness=" + tiredness +
                '}';
    }

    @Override
    public double toWork(int time) {
        double totalWorkDone = 0;
        for (int i = 0; i < time; i++) {
            super.setEfficiency(super.getEfficiency() - tiredness);
            totalWorkDone += super.toWork(1);
        }
        return totalWorkDone;
    }


}
