package lab7;

public class Main {
    public static void main(String[] args) {
        City city = new City("New York");

        House house1 = new House("Brighton street 12");
        house1.addFlat(new Flat(1));
        house1.addFlat(new Flat(2));
        house1.addFlat(new Flat(3));

        house1.flatList.get(0).addSettler(new Settler("Alice"));
        house1.flatList.get(0).addSettler(new Settler("Robert"));
        house1.flatList.get(0).addSettler(new Settler("Viki"));
        house1.flatList.get(2).addSettler(new Settler("Max"));

        city.addHouse(house1);

        city.showSettledList();
    }
}
