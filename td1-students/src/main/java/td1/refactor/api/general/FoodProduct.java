package td1.refactor.api.general;

public interface FoodProduct extends Product,FoodConstituent{

    default double calories() {
        return calories_per_100g()* weight() / 100 ;
    }
}
