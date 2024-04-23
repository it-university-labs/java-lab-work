package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape"));

        String[] array = arrayList.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
    }
}
