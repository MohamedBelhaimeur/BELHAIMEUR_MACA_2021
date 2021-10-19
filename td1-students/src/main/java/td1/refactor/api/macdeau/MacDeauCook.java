package td1.refactor.api.macdeau;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.FoodProduct;

import java.util.List;

public class MacDeauCook implements BurgerCook {
    private String name;
    private List<FoodProduct>items;
    public MacDeauCook(String name, List<FoodProduct>items){
        this.name=name;
        this.items=items;
    }
    @Override
    public BurgerCook with_cheese() {
        return null;
    }

    @Override
    public BurgerCook with_onions() {
        return null;
    }

    @Override
    public BurgerCook with_sauce() {
        return null;
    }

    @Override
    public BurgerCook with_tomato() {
        return null;
    }

    @Override
    public Burger cook() {
        return null;
    }
}
