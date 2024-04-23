package lab1.medium.hard;

import java.util.Scanner;

public class Hard3 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int decimalInt = scanner.nextInt();

        String binaryInt = convertBinary(decimalInt);

        System.out.println("Binary representation: " + binaryInt);
    }

    private static String convertBinary(int decimalInt) {
        StringBuilder binary = new StringBuilder();

        while (decimalInt > 0) {
            int remainder = decimalInt % 2;
            binary.insert(0, remainder);
            decimalInt /= 2;
        }
        return binary.toString();
    }
}
