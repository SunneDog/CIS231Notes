package dec5.Airline;

public abstract class Machine {
    private String name;
    private Boolean isFlying = Boolean.FALSE;

    private final String DEFAULTNAME = "Name Not Provided";

    public Machine() {
        this.name = DEFAULTNAME;
        this.isFlying = Boolean.FALSE;
    }

    public Machine(String name) {
        this.name = name;
        this.isFlying = Boolean.FALSE;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", isFlying=" + isFlying +
                '}';
    }
}
