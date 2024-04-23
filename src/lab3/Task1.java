package lab3;

public class Task1 {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car("BWM", "M3", 240, 2.4);
        cars[1] = new Car("Toyota", "7",200,1.8);
        cars[2] = new Car("Ford", "F150", 260, 5.0);
        cars[3] = new Car("Hundai", "Elantra", 200, 2.8);
        cars[4] = new Car("Honda", "Civic",200,1.6);

        for(Car car : cars) {
            car.ride();
        }
    }
}
