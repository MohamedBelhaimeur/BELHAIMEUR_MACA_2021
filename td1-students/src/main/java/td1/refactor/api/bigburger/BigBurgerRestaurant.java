package td1.refactor.api.bigburger;

import td1.original.api.general.Meat;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.BurgerRestaurant;
import td1.refactor.api.general.MenuType;
import td1.refactor.api.general.Size;

public class BigBurgerRestaurant implements BurgerRestaurant {
    private static final BigBurgerRestaurant bigBurgerRestaurant=new BigBurgerRestaurant();

    private BigBurgerRestaurant(){

    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        return null;
    }

    @Override
    public BurgerCook order_personal(Size size, Meat.MeatType type) {
        return null;
    }
}
