package TD3.Distributeur.client;

import TD3.Distributeur.state.IncorrectStateException;
import TD3.Distributeur.state.VendingMachineContext;


/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachineTest1 {
    public static void main(String[] args) {
        VendingMachineContext machine = new VendingMachineContext();
        //
        try {
            machine.askCoffee();
        }
        catch (IncorrectStateException e) {
            System.out.println(e);}
        //
        try {
            machine.give(5); // { 5 }
            machine.askCoffee();
        }
        catch (IncorrectStateException e) {
            System.out.println(e);
        }
        //
        try {
            machine.give(10); // { 15 }
            machine.askCoffee(); // { 5 }
            System.out.println(machine.getRefund()); // 5
            System.out.println(machine.getRefund()); // 0
        }
        catch (IncorrectStateException e) {
            System.out.println(e);
        }
    }
}
