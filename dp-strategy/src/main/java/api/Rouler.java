package api;

public class Rouler implements DeplacementStrategy {

    @Override
    public void deplacer() {
        System.out.println(("mode de delplacement : rouler"));
    }
}
