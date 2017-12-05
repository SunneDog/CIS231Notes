package dec5.Airline;

public class Pilot {
    private String name;
    private Boolean available;

    public Pilot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean isAvailable() {
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
