package dec5.Airline;

public class FuelMachine extends Machine implements FlyingMachine {
    Double fuelLevel = 0.0;
    Double maxFuelLevel = 10.0;

    public FuelMachine(String name, Double fuelLevel, Double maxFuelLevel) {
        super(name);
        this.fuelLevel = fuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public FuelMachine(String name, Double maxFuelLevel) {
        super(name);
        this.maxFuelLevel = maxFuelLevel;
    }

    @Override
    public Boolean isReadyToFly() { // muse have full tank to fly
        Boolean result = new Boolean(Boolean.FALSE);
        if(fuelLevel.equals(maxFuelLevel)) {
            result = Boolean.TRUE;
        }
        return result;
    }
    @Override
    public Boolean takeOff() { // must be ready to fly
        Boolean result = new Boolean(Boolean.FALSE);
        if(this.isReadyToFly()) {
            result = Boolean.TRUE;
        }
        return result;
    }

    @Override
    public String toString() {
        return "FuelMachine{" +
                "fuelLevel=" + fuelLevel +
                ", maxFuelLevel=" + maxFuelLevel +
                "} " + super.toString();
    }
}
