package nov28;

public class Vehicle {
    private String vin;
    private String color;
    private Double fuelLevel;
    private final static String defaultColor = "black";
    private final static Double defaultFuelMax = 15.0;
    private final static String defaultVin = "13918309183";

    public Vehicle() {
        this(Vehicle.defaultVin, Vehicle.defaultColor, Vehicle.defaultFuelMax);
    }

    public Vehicle(String vin) {
        // Vehicle v = new Vehicle("290202020");
        this(vin, "red", 15.0);
    }

    public Vehicle(String vin, String color, Double fuelLevel) {
        this.vin = vin;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "vin: " + vin + "\ncolor: " + color + "\nfuelLevel: " + fuelLevel;
    }

}
