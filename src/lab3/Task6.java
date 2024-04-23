package lab3;

public class Task6 {
    public static void main(String[] args) {
        Laptop2[] laptops = {
                new Laptop2("ASER", 160000, 7, "YES"),
                new Laptop2("ASUS", 350000, 10, "YES"),
                new Laptop2("Macbook", 720000, 9, "YES")
        };

        for (Laptop2 laptop : laptops) {
            int newPrice = laptop.calcPrice();
            System.out.println(laptop.name + " " + newPrice);
        }
    }
}
