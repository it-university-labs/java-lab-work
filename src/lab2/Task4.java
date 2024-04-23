package lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("Positive: ");
        for(int num : integers) {
            if(num > 0) {
                System.out.println(num + " ");
            }
        }

        System.out.println("Zero: ");
        for(int num : integers) {
            if(num == 0) {
                System.out.println(num + " ");
            }
        }

        System.out.println("Negative: ");
        for(int num : integers) {
            if(num < 0) {
                System.out.println(num + " ");
            }
        }
        scanner.close();
    }
}
