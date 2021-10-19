package td1.refactor.api.general;

import java.util.List;

public abstract class Burger {
    private String name;
    private List<FoodProduct>items;

    public Burger(String name,List<FoodProduct>items){
        this.name=name;
        this.items=items;
    }
    public double calories_per_100g(){
        return items.stream().mapToDouble(e ->e.calories_per_100g()).sum();

    }
    public double calories(){
        return  items.stream().mapToDouble(e ->e.calories()).sum();
    }

    public double weight(){
        return  items.stream().mapToDouble(e ->e.weight()).sum();
    }
    public double price(){
        return  items.stream().mapToDouble(e ->e.price()).sum();
    }

}
