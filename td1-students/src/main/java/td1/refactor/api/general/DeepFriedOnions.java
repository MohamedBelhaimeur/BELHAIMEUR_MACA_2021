package td1.refactor.api.general;

public class DeepFriedOnions implements FoodProduct{
    private static final double BASE_PRICE=1.5;
    private double weight;
    public DeepFriedOnions(double i) {
        this.weight=i;
    }

    @Override
    public double calories() {
        return 20;
    }

    @Override
    public double calories_per_100g() {
        return 50;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public double price() {
          return  weight/100*BASE_PRICE ;


    }
    @Override
    public String toString() {
        return String.format("deep fried onions - (%.0fg) -- %.2f€", weight(), price());
    }

}
