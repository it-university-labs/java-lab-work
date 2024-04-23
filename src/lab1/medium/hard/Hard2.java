package lab1.medium.hard;

import java.util.Scanner;

public class Hard2 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();

        System.out.println("Factors " + n + ": ");

        for (int i = 1; i<=n;i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
