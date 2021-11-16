package TD3.Distributeur.state;

public class VendingMachineStateIntermediaire extends VendingMachineState {

    public static final VendingMachineState instance=new VendingMachineStateIntermediaire();

    private VendingMachineStateIntermediaire(){

    }
    public static VendingMachineState getInstance(){
        return instance;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("Pas possible");
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateEnd.getInstance());
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateEnd.getInstance());
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return c.getRefund();
    }
}
