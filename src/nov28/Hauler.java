package nov28;
import java.util.ArrayList;

public class Hauler extends Vehicle {
    private ArrayList<Vehicle> carLoad;
    private Integer capacity;

    public Hauler() {
        capacity = 5;
        carLoad = new ArrayList<>();
    }

    public boolean hasRoom() {
        return this.capacity > this.carLoad.size();
    }

    public Boolean loadVehicle(Vehicle v) {
        if (this.hasRoom()) {
            this.carLoad.add(v);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public Vehicle unloadVehicle() {
        Vehicle result;
        if(this.carLoad.isEmpty()) {
            return null;
        } else {
            result = carLoad.remove(popOffTop());
            return result;
        }
    }
    private int popOffTop() {
        int result = 0;
        carLoad.trimToSize();
        result = carLoad.size();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + carLoad;
    }
}
