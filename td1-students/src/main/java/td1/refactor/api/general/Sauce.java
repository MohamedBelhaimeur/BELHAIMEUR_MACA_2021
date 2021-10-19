package td1.refactor.api.general;

public class Sauce implements FoodProduct{
    @Override
    public double calories() {
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

    @Override
    public double calories_per_100g() {
        return 0;
    }
}
