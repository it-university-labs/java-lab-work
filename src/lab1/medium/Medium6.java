package lab1.medium;

import java.util.Scanner;

public class Medium6 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double pricePerKg = scanner.nextDouble();

        System.out.println("Output:");

        for (double quantity = 0.1; quantity <= 1.0; quantity += 0.1) {
            double totalPrice = quantity * pricePerKg;
            System.out.printf("Result", quantity, totalPrice);
        }
    }
}
