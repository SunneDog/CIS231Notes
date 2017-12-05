package dec5.Airline;

public class ElectricMachine extends Machine implements FlyingMachine {
    Double charge;

    public ElectricMachine(String name, Double charge) {
        super(name);
        this.charge = charge;
    }

    @Override
    public Boolean isReadyToFly() {
        return null;
    }

    @Override
    public Boolean takeOff() {
        return null;
    }

    @Override
    public String toString() {
        return "ElectricMachine{" +
                "charge=" + charge +
                "} " + super.toString();
    }
}
