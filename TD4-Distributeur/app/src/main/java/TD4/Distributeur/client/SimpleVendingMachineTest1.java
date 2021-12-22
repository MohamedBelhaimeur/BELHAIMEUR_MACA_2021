package TD4.Distributeur.client;

import TD4.Distributeur.state.IncorrectStateException;
import TD4.Distributeur.state.SimpleVendingMachineContext;



public class SimpleVendingMachineTest1 {
    public static void main(String[] args) {
        SimpleVendingMachineContext machine = new SimpleVendingMachineContext();
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
            machine.give(30); // { 35 }
            machine.askCoffee(); // { 30 }
        }
        catch (IncorrectStateException e) {
            System.out.println(e);
        }
        //
        try {
            machine.give(1); // { 1 }
            machine.askCoffee(); // { 1 }
        }
        catch (IncorrectStateException e) {
            System.out.println(e);
        }
    }

}
