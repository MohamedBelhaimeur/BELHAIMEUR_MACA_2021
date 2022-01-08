package td1.refactor.api.general;

public enum MenuType implements  FoodConstituent{
    MEAT_MENU,FISH_MENU,CHEESE_MENU;

    @Override
    public double calories_per_100g() {
        return 30;
    }
}
