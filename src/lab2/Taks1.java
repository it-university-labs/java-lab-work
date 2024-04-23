package lab2;
import java.util.Scanner;

public class Taks1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for (int i =0; i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("Result: ");
        for(int i=0; i<n;n++) {
            if(integers[i] < 0) {
                System.out.println(integers[i] + ' ');
            }
        }

        scanner.close();
    }
}
