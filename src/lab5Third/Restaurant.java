package lab5Third;

interface Restaurant {
    public double getTotalIncome();
    public double getTotalOutcome();
}

class City implements Restaurant {
    private Restaurant[] allRestaurants = new Restaurant[50];
    private int restaurantSize = 0;
    private String cityName;

    City() {}

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public double getTotalIncome() {
        return 0;
    }

    @Override
    public double getTotalOutcome() {
        return 0;
    }

    public void addRestaurant(Restaurant restaurant) {
        return ;
    }
}