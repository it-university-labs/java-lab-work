package lab1.medium.hard;

import java.util.Scanner;

public class Hard5 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = scanner.nextInt();

        if (isPalindrom(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindrom(int number) {
        int initNumber = number;
        int reversedNumber = 0;

        while(number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return initNumber == reversedNumber;
    }
}
