package lab2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            if (integers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = integers[i];
            } else if (integers[i] > secondLargest && integers[i] != firstLargest) {
                secondLargest = integers[i];
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println(secondLargest);
        }

        scanner.close();
    }
}
