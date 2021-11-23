package api;

public class LanceFlamme implements AttaqueStrategy {
    @Override
    public void attaquer() {
        System.out.println("LanceFlamme en main");
    }
}
