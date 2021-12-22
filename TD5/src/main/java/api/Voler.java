package api;

public class Voler implements DeplacementStrategy {
    @Override
    public void deplacer() {
        System.out.println(("mode de delplacement : vole"));
    }
}
