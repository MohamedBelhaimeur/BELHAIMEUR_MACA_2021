package api;

public class Courir implements DeplacementStrategy {

    @Override
    public void deplacer() {
        System.out.println(("mode de delplacement : course"));
    }
}
