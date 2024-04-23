package lab9Second;
import java.util.Scanner;

class Car extends Thread {
    String name;
    int speed;
    int timeTaken;

    static int finishLine;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        int distance = 0;
        int time = 0;
        while (distance < finishLine) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
            distance += speed;
            System.out.println(name + " is in " + distance + " meters");
        }
        timeTaken = time;
        System.out.println(name + " finished in " + time + " seconds");
    }
}