package td1.refactor.api.bigburger;

import td1.original.api.general.Meat;
import td1.refactor.api.general.*;

public class BigBurgerRestaurant implements BurgerRestaurant {
    private static BigBurgerRestaurant instance = null;

    public BigBurgerRestaurant() { }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        BurgerCook burger = null;
        switch (menu) {
            case MEAT_MENU:
                burger = new BigBurgerCook("Bigmm", Size.BIG, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_tomato();
                break;
            case FISH_MENU:
                burger = new BigBurgerCook("fish", Size.MEDIUM, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                burger = new BigBurgerCook("fromage", Size.MEDIUM, MeatType.BEEF).with_cheese().with_onions();
        }
        return burger;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return new BigBurgerCook("name", size, type);
    }

    public static BigBurgerRestaurant queue(){
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }
}
