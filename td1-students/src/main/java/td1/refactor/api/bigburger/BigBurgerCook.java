package td1.refactor.api.bigburger;

import td1.refactor.api.general.*;

import java.util.ArrayList;
import java.util.List;

public class BigBurgerCook implements BurgerCook {
    private final String name ;
    private final List<FoodProduct> items ;

    BigBurgerCook(String name, Size size, MeatType type) {
        this.name = name;
        double weight;
        switch (size) {
            case SMALL:
                weight = 50;
                break;
            case MEDIUM:
                weight = 150;
                break;
            case BIG:
            default:
                weight = 380;
        }
        this.items = new ArrayList<>();
        this.items.add(new Meat(type, weight));
    }

    @Override
    public BurgerCook with_cheese() {
        this.items.add(new Cheddar(30));
        return this;
    }

    @Override
    public BurgerCook with_onions() {
        this.items.add(new DeepFriedOnions(20));
        return this;
    }

    @Override
    public BurgerCook with_sauce(SauceType sauce) {
        this.items.add(new Sauce(sauce, 20));
        return this;
    }

    @Override
    public BurgerCook with_tomato() {
        this.items.add(new Tomato(10));
        return this;
    }

    @Override
    public Burger cook() {
        return new BigBurgerBurger(name, items);
    }
}
