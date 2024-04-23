package lab1.medium;
import java.util.Scanner;
public class Medium3 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nubmer n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            sum += (double)i / j;
        }

        System.out.printf("Output:", sum);
    }
}
