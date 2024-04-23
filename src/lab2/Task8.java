package lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        int sum = 0;
        boolean zeros = false;

        for(int num : integers) {
            if (num == 0) {
                zeros = !zeros;
            } else if (zeros) {
                sum += num;
            }
        }

        System.out.println("Result" + sum);
        scanner.close();
    }
}
