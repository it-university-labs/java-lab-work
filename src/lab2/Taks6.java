package lab2;

import java.util.Scanner;

public class Taks6 {
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
        int countNonZero = 0;

        for (int num : integers) {
            if (num != 0) {
                product *= num;
                countNonZero++;
            }
        }

        double geometricMean = Math.pow(product, 1.0 / countNonZero);
    }
}
