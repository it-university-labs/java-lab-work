package lab8.secondTask;

import java.io.*;
import java.util.ArrayList;

import static javax.script.ScriptEngine.FILENAME;

public class Client {
    private static final String GOODS_FILE = "goodItems.txt";
    private static final String BUY_HISTORY_FILE = "buyHistory.txt";

    public static void main(String[] args) {
        System.out.println("PRESS [1] LIST GOODS");
        System.out.println("PRESS [2] BUY GOOD");
        System.out.println("PRESS [3] LIST BUY HISTORY");
        System.out.println("PRESS [0] TO EXIT");

    }

    public static ArrayList<GoodItem> getGoodItemList() {
        ArrayList<GoodItem> goods = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(GOODS_FILE))) {
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

    public static ArrayList<BuyHistory> getBuyHistory() {
        ArrayList<BuyHistory> history = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                BuyHistory buyHistory = new BuyHistory();
                buyHistory.setGoodName(data[0]);
                buyHistory.setGoodPrice(Integer.parseInt(data[1]));
                buyHistory.add(history);
            }
        } catch (IOException e) {
            System.err.println("Error reading goods from file: " + e.getMessage());
        }
        return history;
    }

    public static void saveBuyHistory(ArrayList<BuyHistory> buyHistory) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for(BuyHistory buyHistory1 : buyHistory ) {
                bw.write(buyHistory1.getGoodName() + " " + buyHistory1.getBuyTime());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing goods to file: " + e.getMessage());
        }
    }
}
