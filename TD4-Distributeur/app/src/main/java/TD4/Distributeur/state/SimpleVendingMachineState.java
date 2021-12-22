package TD4.Distributeur.state;


public abstract class SimpleVendingMachineState {
    public abstract void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException;

    public abstract void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException;

    public abstract void askTea(SimpleVendingMachineContext c) throws IncorrectStateException;


}
