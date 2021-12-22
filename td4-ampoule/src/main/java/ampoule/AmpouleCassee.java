package ampoule;

public final class AmpouleCassee implements AmpouleState {

    private static final AmpouleState INSTANCE = new AmpouleCassee();
    private static final String INFO = "cassée";
    private static final String REP = "réparée";

    public static AmpouleState instance() {
        return INSTANCE;
    }

    private AmpouleCassee() {}

    @Override
    public void allumer(Ampoule a) {
        System.out.println(INFO); // pour l'illustration
    }

    @Override
    public void eteindre(Ampoule a) {
        System.out.println(INFO); // pour l'illustration
    }

    @Override
    public void reparer(Ampoule a) {
        a.razUsage();
        a.setState(AmpouleEteinte.instance());
        System.out.println(REP);
    }
    
}
