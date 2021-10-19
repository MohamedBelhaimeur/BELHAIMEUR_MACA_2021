package td1.refactor.api.general;

public class Meat implements FoodProduct{
    private double weight;
    private MeatType meattype;

    public Meat(MeatType meattype,double weight) {
        this.meattype = meattype;
        this.weight=weight;
    }


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
