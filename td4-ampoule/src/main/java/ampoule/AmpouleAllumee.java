package ampoule;

public final class AmpouleAllumee implements AmpouleState {

    private static final AmpouleState INSTANCE = new AmpouleAllumee();

    public static AmpouleState instance() {
        return INSTANCE;
    }

    private AmpouleAllumee() {}

    @Override
    public void eteindre(Ampoule a) {
        a.setState(AmpouleEteinte.instance());
        System.out.println("-> éteinte");
    }

    @Override
    public void allumer(Ampoule a) {
        System.out.println("déjà allumée"); // pour l'illustration
    }

    @Override
    public void reparer(Ampoule a) {
        System.out.println("pas possible");
    }
    
}
