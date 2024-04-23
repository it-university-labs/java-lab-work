package lab1.medium;

import java.util.Scanner;

public class Medium5 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nubmer n: ");
        int sum = 0;
        int count = 0;
        int input;

        do {
            input = scanner.nextInt();

            if(input != 0) {
                sum += input;
                count++;
            }
        } while (input != 0);

        double average = (count > 0) ? (double) sum / count : 0.0;
        System.out.printf("Output: ", count, average);
    }
}
