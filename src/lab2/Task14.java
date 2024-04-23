package lab2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an element to search");
        String elementToSearch = scanner.nextLine();

        if (arrayList.contains(elementToSearch)) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }

        scanner.close();
    }
}
