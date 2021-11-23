package api;

public class Missile implements AttaqueStrategy {
    @Override
    public void attaquer() {
        System.out.println("Missile en main");
    }
}
