package TD3.Distributeur.state;

public class SimpleVedingMachineStateEnd extends SimpleVendingMachineState {
    public static final SimpleVendingMachineState instance= new SimpleVedingMachineStateEnd();

    private SimpleVedingMachineStateEnd(){

    }
    public static SimpleVendingMachineState getInstance(){
        return instance;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("pas possible");
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        c.setState(SimpleVendingMachineStateBegin.getInstance());
        c.setCurrentmonney(0);
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        c.setState(SimpleVendingMachineStateBegin.getInstance());
        c.setCurrentmonney(0);
    }
}
