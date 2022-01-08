package td1.refactor.api.general;

public class Tomato implements  FoodProduct{
    private static final double BASE_PRICE=0.5;
    private double weight;
    public Tomato(double i) {
        this.weight=i;
    }

    @Override
    public double calories() {
        return 20;
    }

    @Override
    public double calories_per_100g() {
        return 70;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight/100;
    }

    @Override
    public String toString() {
        return String.format("tomato - qty: %.0f -- %.2f", weight(), price());
    }
}
