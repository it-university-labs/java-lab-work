package lab1.medium;

import java.util.Scanner;

public class Medium10 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value n: ");
        int n = scanner.nextInt();

        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(currentNumber + ' ');
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}
