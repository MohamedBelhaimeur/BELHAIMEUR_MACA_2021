package TD4.Distributeur.state;

public class VendingMachineStateBegin  extends VendingMachineState{

    public static final VendingMachineState instance=new VendingMachineStateBegin();

    private VendingMachineStateBegin(){

    }
    public static VendingMachineState getInstance(){
        return instance;
    }
    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        if(c.getCash()+money<10){
        c.setCash(money+c.getCash());
        }
        else{
            c.setState(VendingMachineStateIntermediaire.getInstance());
            c.setCash(money+c.getCash());
        }
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Pas possible");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Pas possible");
    }

    //get refund est deja implementé dans la classe abstraite


}
