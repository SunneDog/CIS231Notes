package dec12;
import dec5.Airline.*;

import java.util.ArrayList;

public class Airport {
    private ArrayList<Machine> machines;
    private ArrayList<Pilot> pilots;

    public Airport() {
        this.machines = new ArrayList<>();
        this.pilots = new ArrayList<>();

        this.machines.add(new AnalogMachine("Puppy", 20.0));
        this.machines.add(new ElectricMachine("Volta", 50.0));
        this.machines.add(new FuelMachine("Old School", 20.0));

        this.pilots.add(new Pilot("Billy"));
        this.pilots.add(new Pilot("Jim"));
        this.pilots.add(new Pilot("Vanessa"));
    }

    public String getPilots() {
        return this.pilots.toString();
    }

    public String getMachines() {
        return this.machines.toString();
    }

}