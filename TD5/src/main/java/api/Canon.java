package api;

public class Canon implements AttaqueStrategy {
    @Override
    public void attaquer() {
        System.out.println("Canon en main");
    }
}
