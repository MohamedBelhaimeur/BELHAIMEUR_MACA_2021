package td1.refactor.api.general;

import td1.original.api.general.Meat;

public interface BurgerRestaurant {
    BurgerCook order_menu(MenuType menu);
    BurgerCook order_personal(Size size, Meat.MeatType type);
}
