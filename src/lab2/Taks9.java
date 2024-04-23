package lab2;

import java.util.Scanner;

public class Taks9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("Enter an integer m: ");
        int m = scanner.nextInt();

        boolean found = false;
        int index = -1;

        for(int i=0;i<n;i++) {
            if (integers[i] == m) {
              found = true;
              index = i;
              break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
