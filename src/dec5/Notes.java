package dec5;
import dec5.Airline.*;
import java.util.ArrayList;

public class Notes {

    /*
     * ABSTRACT VS INTERFACE
     *      Abstract
     *          used via extends
     *          must have one abstract element, can have normal elements mixed in
     *
     *      Interface
     *          used via implements
     *          forces implementer to use methods
     */


    public static void main(String[] args) {
        ArrayList<Machine> machines = new ArrayList<>();

        FuelMachine fuel = new FuelMachine("Fuel Machine", 15.0);
        ElectricMachine ele = new ElectricMachine("Ele Machine", 10.0);
        AnalogMachine ana = new AnalogMachine("Ana Machine", 40.0);


        machines.add(fuel); machines.add(ele); machines.add(ana);

        for(Machine machine : machines) {
            System.out.println(machine.toString());
        }



    }
}
