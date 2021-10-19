package td1.refactor.api.macdeau;

import td1.original.api.general.Meat;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.BurgerRestaurant;
import td1.refactor.api.general.MenuType;
import td1.refactor.api.general.Size;

public class MacDeauRestaurant implements BurgerRestaurant {
   private static final MacDeauRestaurant macdeauRestaurant=new MacDeauRestaurant();

    private MacDeauRestaurant(){

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
