package lab1.medium;

import java.util.Scanner;

public class Medium9 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value n: ");
        int n = scanner.nextInt();

        int number = 8;
        int sum = 0;
        int multiplier = 1;

        for (int i = 0; i < n; i++) {
            sum += number * multiplier;
            multiplier = multiplier * 10 + 1;
        }

        System.out.println("Output: " + sum);
    }
}
