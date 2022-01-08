package td1.refactor.api.general;

public class Cheddar implements FoodProduct{
    private double BASE_PRICE=4;
    private double weight;
    public Cheddar(double weight) {
        this.weight=weight;
    }

    @Override
    public double calories() {
        return 20;
    }

    @Override
    public double calories_per_100g() {
        return 100;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public double price() {
        return BASE_PRICE*weight/100;
    }

    @Override
    public String toString() {
        return String.format("cheddar - (%.0fg) -- %.2f€", weight(), price());
    }
}
