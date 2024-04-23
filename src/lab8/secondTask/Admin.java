package lab8.secondTask;

import java.io.*;
import java.util.ArrayList;

public class Admin {
    private static final String FILENAME = "goodItems.txt";

    public static void main(String[] args) {
        ArrayList<GoodItem> good = getGoodItemList();

        System.out.println("PRESS [1] ADD GOOD");
        System.out.println("PRESS [2] LIST GOODS");
        System.out.println("PRESS [3] DELETE GOOD");
        System.out.println("PRESS [0] TO EXIT");

    }

    public static ArrayList<GoodItem> getGoodItemList() {
        ArrayList<GoodItem> goods = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                GoodItem good = new GoodItem();
                good.setName(data[0]);
                good.setPrice(Integer.parseInt(data[1]));
                goods.add(good);
            }
        } catch (IOException e) {
            System.err.println("Error reading goods from file: " + e.getMessage());
        }
        return goods;
    }

    public static void saveGoodItems(ArrayList<GoodItem> goodItems) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for(GoodItem goodItem : goodItems) {
                bw.write(goodItem.getName() + " " + goodItem.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing goods to file: " + e.getMessage());
        }
    }
}
