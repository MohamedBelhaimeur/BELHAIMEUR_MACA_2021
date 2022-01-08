package td1.refactor.api.macdeau;

import td1.original.api.general.Meat;
import td1.refactor.api.general.*;

public class MacDeauRestaurant implements BurgerRestaurant {
    private static MacDeauRestaurant instance = null;


    private MacDeauRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new MacDeauRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        BurgerCook burger = null;
        switch (menu) {
            case MEAT_MENU:
                burger = new MacDeauCook("Beefy", Size.MEDIUM, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_cheese();
                break;
            case FISH_MENU:
                burger = new MacDeauCook("Fishy", Size.SMALL, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                burger = new MacDeauCook("Cheesy", Size.SMALL, MeatType.BEEF).with_cheese();
        }
        return burger;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return new MacDeauCook("Own style", size, type);
    }



}
