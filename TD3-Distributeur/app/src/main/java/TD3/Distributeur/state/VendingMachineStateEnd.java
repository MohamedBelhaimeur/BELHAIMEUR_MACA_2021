package TD3.Distributeur.state;

public class VendingMachineStateEnd extends VendingMachineState{

    public static final VendingMachineState instance=new VendingMachineStateEnd();

    private VendingMachineStateEnd(){

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
        throw new IncorrectStateException("Pas possible");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Pas possible");
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return c.getCash();
    }
}
