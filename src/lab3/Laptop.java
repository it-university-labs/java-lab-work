package lab3;

class Laptop2 {
    String name;
    int price;
    int generation_of_CPU;
    String ssd;

    Laptop2(){

    }

    Laptop2(String name, int price, int generation_of_CPU, String ssd ) {
        this.name = name;
        this.price = price;
        this.generation_of_CPU = generation_of_CPU;
        this.ssd = ssd;
    }

    int calcPrice() {
        double newPrice = price;
        if ( generation_of_CPU == 8) {
            newPrice += 0.10 * price;
        } else if (generation_of_CPU == 9) {
            newPrice += 0.15 * price;
        } else if (generation_of_CPU == 10) {
            newPrice += 0.20 * price;
        }

        if(ssd.equalsIgnoreCase("YES")) {
            newPrice += 0.15 * price;
        }

        return (int) Math.round(newPrice);
    }
}
