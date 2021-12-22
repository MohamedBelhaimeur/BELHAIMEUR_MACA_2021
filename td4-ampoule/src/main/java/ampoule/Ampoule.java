package ampoule;

public final class Ampoule {

    public static final int MAX_USAGES = 2;
    private int usages;
    private AmpouleState state;

    public Ampoule() {
        this.state = AmpouleEteinte.instance();
        this.usages = 0;
    }

    void setState(AmpouleState s) { // package
        this.state = s;
    }

    public AmpouleState getState() {return this.state;}

    public int usages() { // package
        return usages;
    }

    void razUsage() {
        usages = 0;
    }

    void augmenterUsages() { // package
        usages++;
    }

    public void allumer() {
        this.state.allumer(this);
    }

    public void eteindre() {
        this.state.eteindre(this);
    }

    public void reparer() {
        this.state.reparer(this);
    }
    
}
