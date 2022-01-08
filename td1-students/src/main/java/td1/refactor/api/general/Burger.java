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

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(String.format(" Menu %s \n", name));
        for (FoodProduct item : items) {
            b.append(String.format("- %s\n", item));
        }
        b.append("//////////////////\n");
        b.append(String.format("calories:      %.0f\n", calories()));
        b.append("//////////////////\n");
        b.append(String.format("price:         %.2f\n", price()));
        b.append(String.format("calories/100g: %.0f\n", calories_per_100g()));
        b.append("//////////////////\n");
        return b.toString();
    }

}
