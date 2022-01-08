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
        return 40;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public double price() {
        return this.meattype.price()*weight/100;
    }

    @Override
    public double calories_per_100g() {
        return this.meattype.calories_per_100g();
    }
    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", meattype, weight(), price());
    }
}
