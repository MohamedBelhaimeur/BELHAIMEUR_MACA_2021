package TD4.Distributeur.state;

public abstract class VendingMachineState {

    public abstract void give(VendingMachineContext c, int money) throws IncorrectStateException;

    public abstract void askCoffee(VendingMachineContext c) throws IncorrectStateException;

    public abstract void askTea(VendingMachineContext c) throws IncorrectStateException;

    public  int getRefund(VendingMachineContext c) throws IncorrectStateException {
        int temp=c.getCash();
        c.setCash(0);
        c.setState(VendingMachineStateBegin.getInstance());
        return temp;
    }


}
