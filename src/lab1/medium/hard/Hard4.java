package lab1.medium.hard;

import java.util.Scanner;

public class Hard4 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = findSum(x, n);

        System.out.println("Output: " + sum);
    }

    private static int findSum(int x, int n) {
        int sum = 0;
        int power = 1;

        for(int i = 1;i<=n;i++) {
            if (i%2 !=0) {
                sum += Math.pow(x, power);
            } else {
                sum -=  Math.pow(x, power);
            }
            power += 2;
        }
        return sum;
    }
}
