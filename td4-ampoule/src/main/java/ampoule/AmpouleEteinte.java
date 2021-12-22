package ampoule;

public final class AmpouleEteinte implements AmpouleState {

    private static final AmpouleState INSTANCE = new AmpouleEteinte();

    public static AmpouleState instance() {
        return INSTANCE;
    }

    private AmpouleEteinte() {}

    @Override
    public void allumer(Ampoule a) {
        if (a.usages()+1 > Ampoule.MAX_USAGES) {
            a.setState(AmpouleCassee.instance());
            System.out.println("-> cassée");
        }
        else {
            a.setState(AmpouleAllumee.instance());
            a.augmenterUsages();
            System.out.println("-> allumée");
        }
    }

    @Override
    public void eteindre(Ampoule a) {
        System.out.println("déjà éteinte"); // pour l'illustration
    }

    @Override
    public void reparer(Ampoule a) {
        a.razUsage();
    }
    
}
