package TD3.Distributeur.client;

import TD3.Distributeur.state.IncorrectStateException;
import TD3.Distributeur.state.SimpleVendingMachineContext;


/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
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
