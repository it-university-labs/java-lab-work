package lab8.secondTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import static javax.script.ScriptEngine.FILENAME;

class GoodItem {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;

    public BuyHistory(String goodName, int goodPrice) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = new Date();
    }

    public BuyHistory(String goodName, int goodPrice, Date buyTime) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = buyTime;
    }

    public BuyHistory() {

    }

    public String getGoodName() {
        return goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    @Override
    public String toString() {
        return "BuyHistory{" +
                "goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", buyTime=" + buyTime +
                '}';
    }

    public void add(ArrayList<BuyHistory> history) {
    }
}