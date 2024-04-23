package lab2;

import java.util.Scanner;

public class Taks7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.print("Enter an integer m: ");
        int m = scanner.nextInt();

        int countGreaterThanM = 0;
        for (int num : integers) {
            if (num > m) {
                countGreaterThanM++;
            }
        }

        System.out.println("Number of elements greater than " + m + ": " + countGreaterThanM);

        scanner.close();
    }
}
