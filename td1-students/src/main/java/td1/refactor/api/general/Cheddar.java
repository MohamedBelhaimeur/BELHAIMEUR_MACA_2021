package td1.refactor.api.general;

public class Cheddar implements FoodProduct{
    private double BASE_PRICE=4;
    private double weight;
    public Cheddar(double weight) {
        this.weight=weight;
    }

    @Override
    public double calories() {
        return 0;
    }

    @Override
    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public double price() {
        return 0;
    }
}
