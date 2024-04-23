package lab2;
import java.util.*;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");

        System.out.println("Init: " + arrayList);

        Collections.swap(arrayList, 0, arrayList.size() - 1);

        System.out.println("After: " + arrayList);
    }
}
