package td1.refactor.api.general;

public enum MeatType implements FoodConstituent {

    BEEF,WHITEFISH;


    @Override
    public double calories_per_100g() {
        return 0;
    }
    public double price(){
        return 0;
    }
}
