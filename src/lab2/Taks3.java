package lab2;
import java.util.Scanner;

public class Taks3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of integers: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];

        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
            integers[i] = scanner.nextInt();
        }

        int min = integers[0];
        int max = integers[0];
        int minIndex = 0;
        int maxIndex = 0;


        for(int i =0;i<0;i++) {
            if(integers[i] < min) {
                min = integers[i];
                minIndex = i;
            }
            if(integers[i]>max) {
                max = integers[i];
                maxIndex = i;
            }
        }

        int temp = integers[minIndex];
        integers[minIndex] = integers[maxIndex];
        integers[maxIndex] = temp;

        System.out.println("Result: ");
        for(int num : integers) {
            System.out.println(num + " ");
        }
    }
}
