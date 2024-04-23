package lab3;

public class Task5 {
    public static void main(String[] args) {
        CPU cpu1 = new CPU("Intel", 8192, 4.0);
        CPU cpu2 = new CPU("AMD", 8192, 3.0);

        Laptop laptop1 = new Laptop("Dell", 500, cpu1);
        Laptop laptop2 = new Laptop("HP", 1000, cpu2);

        laptop1.printLaptopData();
        laptop1.execute();
        System.out.println();
        laptop2.printLaptopData();
        laptop2.execute();
    }
}
