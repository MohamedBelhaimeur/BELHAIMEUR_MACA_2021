package td1.refactor.api.macdeau;

import td1.refactor.api.general.*;

import java.util.ArrayList;
import java.util.List;

public class MacDeauCook implements BurgerCook {
    String name;
    List<FoodProduct> items;

    MacDeauCook(String name, Size size, MeatType type) {
        this.name = name;
        double weight;
        switch (size) {
            case SMALL:
                weight = 80;
                break;
            case MEDIUM:
                weight = 100;
                break;
            case BIG:
            default:
                weight = 250;
        }
        this.items = new ArrayList<>();
        this.items.add(new Meat(type, weight));
    }

    @Override
    public MacDeauCook with_sauce(SauceType sauce) {
        this.items.add(new Sauce(sauce, 40));
        return this;
    }

    @Override
    public MacDeauCook with_onions() {
        this.items.add(new DeepFriedOnions(10));
        return this;
    }

    @Override
    public MacDeauCook with_tomato() {
        this.items.add(new Tomato(10));
        return this;
    }

    @Override
    public MacDeauCook with_cheese() {
        this.items.add(new Cheddar(15));
        return this;
    }

    @Override
    public Burger cook() {
        return new MacDeauBurger(name, items);
    }
}
