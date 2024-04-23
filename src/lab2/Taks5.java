package lab2;

import java.util.Scanner;

public class Taks5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        int product = 1;
        for (int num : integers) {
            if (num != 0) {
                product *= num;
            }
        }
        System.out.println("Product: " + product);

        scanner.close();
    }
}
