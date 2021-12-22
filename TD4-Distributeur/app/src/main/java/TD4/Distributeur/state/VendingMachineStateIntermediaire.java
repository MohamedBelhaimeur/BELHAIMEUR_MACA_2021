package TD4.Distributeur.state;

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
        System.out.println("café donné");
        c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateEnd.getInstance());
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("thé donné");
        c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateEnd.getInstance());
    }

  //get refund est deja implementé dans la classe abstraite
}
