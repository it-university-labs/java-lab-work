package lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {

        String[] array = {"apple", "banana", "orange", "grape"};

        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList);


    }
}
