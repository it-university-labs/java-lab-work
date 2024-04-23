package lab3;

public class Task2 {
    public static void main(String[] args) {
        Car [] cars = new Car[10];

        cars[0] = new Car("BWM", "M3", 240, 2.4);
        cars[1] = new Car("Toyota", "7",200,1.8);
        cars[2] = new Car("Ford", "F150", 260, 5.0);
        cars[3] = new Car("Hundai", "Elantra", 200, 2.8);
        cars[4] = new Car("Honda", "Civic",200,1.6);
        cars[5] = new Car("Mercedes", "230", 280, 3.5);
        cars[6] = new Car("Dodge", "Hellcat",310,4.0);
        cars[7] = new Car("Kia", "k9", 250, 2.8);
        cars[8] = new Car("Chevrolet", "Tahoe", 300, 6.0);
        cars[9] = new Car("Jeep", "Wrangler",270,4.0);

        Car speedTest = cars[0];
        for(int i = 1;i<cars.length;i++) {
            if(cars[i].maxSpeed > speedTest.maxSpeed) {
                speedTest = cars[i];
            }
        }

        System.out.println("Car with maximum speed:" + speedTest.toString());
    }
}
