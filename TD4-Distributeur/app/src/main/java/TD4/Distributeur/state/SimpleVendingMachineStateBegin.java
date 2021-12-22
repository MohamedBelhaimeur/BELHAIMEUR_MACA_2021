package TD4.Distributeur.state;

public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState{
    public static final SimpleVendingMachineState instance=new SimpleVendingMachineStateBegin();

    private SimpleVendingMachineStateBegin(){

    }

    public static SimpleVendingMachineState getInstance(){
        return instance;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        if(money+c.getCurrentmonney()>=10){
            c.setState(SimpleVedingMachineStateEnd.getInstance());
            c.setCurrentmonney(money+c.getCurrentmonney());
        }
        else{
            c.setCurrentmonney(money+c.getCurrentmonney());
        }



    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Pas possible.");
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        throw new IncorrectStateException("Pas possible");
    }
}
