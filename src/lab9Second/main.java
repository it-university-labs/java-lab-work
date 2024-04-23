package lab9Second;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car.finishLine = scanner.nextInt();

        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter the name of car " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the speed of car " + (i + 1) + " (in m/s): ");
            int speed = scanner.nextInt();
            cars[i] = new Car(name, speed);
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }

        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Place" + (i + 1) + ": " + cars[i].name + " - " + cars[i].timeTaken + " seconds");
        }
    }
}