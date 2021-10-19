package td1.refactor.api.macdeau;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.FoodProduct;

import java.util.List;

public class MacDeauBurger extends Burger {
    public MacDeauBurger(String name, List<FoodProduct> items) {
        super(name, items);
    }
}
