package TD4.Distributeur.state;


public class VendingMachineContext {
    private VendingMachineState current;
    private int cash;

    public VendingMachineContext() {
        cash = 0;
        current = VendingMachineStateBegin.getInstance();
    }

    void setState(VendingMachineState s) {
        current = s;
    }

    void setCash(int cash) {
        this.cash = cash;
    }

    int getCash() {
        return cash;
    }

    public void give(int money) throws IncorrectStateException {
        current.give(this, money);

    }

    public void askCoffee() throws IncorrectStateException {
        current.askCoffee(this);
    }

    public void askTea() throws IncorrectStateException {
        current.askTea(this);
    }

    public int getRefund() throws IncorrectStateException {
        return current.getRefund(this);
    }


}
