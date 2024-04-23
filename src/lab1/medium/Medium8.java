package lab1.medium;

import java.util.Scanner;

public class Medium8 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int currentSum = 0;

        for (int i = 1; i <= n; i++) {
            currentSum += i;
            sum += currentSum;
        }

        System.out.println("Output: " + sum);
    }
}
