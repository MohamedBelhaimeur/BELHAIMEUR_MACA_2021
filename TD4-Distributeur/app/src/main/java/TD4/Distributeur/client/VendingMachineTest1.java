package TD4.Distributeur.client;

import TD4.Distributeur.state.IncorrectStateException;
import TD4.Distributeur.state.VendingMachineContext;



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
