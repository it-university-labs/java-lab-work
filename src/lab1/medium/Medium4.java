package lab1.medium;
import java.util.Scanner;

public class Medium4 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nubmer n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (double)i / (5 * i);
        }

        System.out.printf("Output:", sum);
    }
}
