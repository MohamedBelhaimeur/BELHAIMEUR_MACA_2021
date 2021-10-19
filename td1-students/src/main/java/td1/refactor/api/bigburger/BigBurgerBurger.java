package td1.refactor.api.bigburger;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.FoodProduct;

import java.util.List;

public class BigBurgerBurger extends Burger {

    public BigBurgerBurger(String name, List<FoodProduct> items) {
        super(name, items);
    }
}
