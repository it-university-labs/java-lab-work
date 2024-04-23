package lab6.seventh;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        cars[0] = new Mercedes("Mercedes1", 1000, 2, 200);
        cars[1] = new Mercedes("Mercedes2", 1100, 2.5, 250);
        cars[2] = new Mercedes("Mercedes3", 1200, 2.3, 180);
        cars[3] = new Mercedes("Mercedes4", 1250, 2.8, 210);
        cars[4] = new Mercedes("Mercedes5", 1300, 3, 220);
        cars[5] = new Hammer("Hammer1", 1000, 2.2, 0.2);
        cars[6] = new Hammer("Hammer2", 1100, 2.6, 0.25);
        cars[7] = new Hammer("Hammer3", 1150, 2.4, 0.18);
        cars[8] = new Hammer("Hammer4", 1200, 2.9, 0.22);
        cars[9] = new Hammer("Hammer5", 1250, 3.1, 0.28);

        double totalWork10 = calculateTotalWork(cars, 10);
        System.out.println("Total work of cars in 10 seconds" + totalWork10);
        double totalWork1 = calculateTotalWork(cars, 3600);
        System.out.println("Total work of cars in 1 hour" + totalWork1);

        System.out.println("Work done by each car in one hour");
        for(Car car : cars) {
            System.out.println(car.getModel() + ": " + car.ride(3600));
        }

        Car maxPowerCar = findMaxPowerCar(cars);
        System.out.println("Car with max power" + maxPowerCar);

        Car maxWorkDoneByCar = findMaxWorkCar(cars, 7200);
        System.out.println("Car that done the max work> " + maxWorkDoneByCar);
    }

    public static double calculateTotalWork(Car[] cars, int timeInSeconds) {
        double totalWork = 0;
        for(Car car : cars) {
            totalWork += car.ride(timeInSeconds);
        }
        return totalWork;
    }

    public static Car findMaxPowerCar(Car[] cars) {
       Car maxPowerCar = cars[0];
       for (Car car : cars) {
           if (car.getPower() > maxPowerCar.getPower()) {
               maxPowerCar = car;
           }
       }
       return maxPowerCar;
    }

    public static Car findMaxWorkCar(Car[] cars,int time) {
        Car maxWork = cars[0];
        for(Car car : cars) {
            if(car.ride(time) > maxWork.ride(time)) {
                maxWork = car;
            }
        }
        return maxWork;
    }
}
