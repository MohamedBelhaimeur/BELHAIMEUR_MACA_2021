package TD3.Distributeur.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public abstract class VendingMachineState {

    public abstract void give(VendingMachineContext c, int money) throws IncorrectStateException;

    public abstract void askCoffee(VendingMachineContext c) throws IncorrectStateException;

    public abstract void askTea(VendingMachineContext c) throws IncorrectStateException;

    public abstract int getRefund(VendingMachineContext c) throws IncorrectStateException;

    public void setRefund(VendingMachineContext c ,int cash){
        c.setCash(0);
        c.setState(VendingMachineStateBegin.getInstance());
    }
}
