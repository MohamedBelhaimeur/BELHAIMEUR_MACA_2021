package td1.refactor.api.general;

public class Sauce implements FoodProduct{

    private double weight;
    private double BASE_PRICE = 1.5;
    private SauceType sauce;

    public Sauce(SauceType sauce,double weight) {
        this.weight = weight;
        this.sauce=sauce;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("deep fried onions (%.0fg) -- %.2f€", weight(), price());
    }

    @Override
    public double calories_per_100g() {
        return this.sauce.calories_per_100g();
    }

    @Override
    public double calories() {
        return 10;
    }
}
