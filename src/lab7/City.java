package lab7;

import java.util.ArrayList;

class City {
    private String name;
    private ArrayList<House> houseList;

    public City(String name){
        this.name = name;
        this.houseList = new ArrayList<>();
    }

    public void addHouse(House house) {
        houseList.add(house);
    }

    public void showSettledList(){
        System.out.println("Settled residents in" + name + ": ");
        for(House house : houseList) {
            house.showSettledList();
        }
    }
}

class House {
    String address;
    ArrayList<Flat> flatList;

    public House(String address) {
        this.address = address;
        this.flatList = new ArrayList<>();
    }

    public void addFlat(Flat flat) {
        flatList.add(flat);
    }

    public void showSettledList() {
        System.out.println("Residents in" + address + ":");
        for (Flat flat : flatList) {
            flat.showSettledList();
        }
    }
}

class Flat {
    private int number;
    private ArrayList<Settler> settlerList;

    public Flat(int number) {
        this.number = number;
        this.settlerList = new ArrayList<>();
    }

    public void addSettler(Settler settler) {
        if (settlerList.size() < 2) {
            settlerList.add(settler);
        } else {
            System.out.println("The flat is full");
        }
    }

    public void showSettledList() {
        System.out.println("Residents in flat " + number);
        for (Settler settler : settlerList) {
            System.out.println(": " + settler.getName());
        }
    }
}

class Settler {
    private String name;
    public Settler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
