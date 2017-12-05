package dec5.Airline;

public class AnalogMachine extends Machine implements FlyingMachine {
    Double windSpeed;

    public AnalogMachine(String name, Double windSpeed) {
        super(name);
        this.windSpeed = windSpeed;
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
        return "AnalogMachine{" +
                "windSpeed=" + windSpeed +
                "} " + super.toString();
    }
}
