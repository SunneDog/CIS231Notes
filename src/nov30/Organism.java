package nov30;

public class Organism {
    private Boolean alive;
    private String name;

    // default constructor: no parameters
    public Organism() { // Organism o = new Organism();
        this(Boolean.TRUE, "default");
    }

    public Organism(Boolean alive) { // Organism o = new Organism(true)
        this.alive = alive;
    }

    public Organism(Boolean alive, String name) {
        this(alive);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "alive=" + alive +
                ", name='" + name + '\'' +
                '}';
    }

    public Boolean isAlive() {
        return this.alive.booleanValue();
    }

}
