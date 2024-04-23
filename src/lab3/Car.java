package lab3;

public class Car {
    String name;
    String model;
    int maxSpeed;
    double engineVolume;

    Car(){

    }

    Car(String name, String model, int maxSpeed, double engineVolume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car: " + name + " " + model + " " + maxSpeed + engineVolume;
    }

    void ride() {
        if (engineVolume > 2.2) {
            System.out.println("Car is riging");
        } else {
            System.out.println("Couldn't start engine");
        }
    }
}
