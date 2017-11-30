package nov30;

public class Monera extends Organism {
    // single cell, asexual repro
    private Gardener primaryCare;

    public Monera(Boolean alive, String name) {
        super(alive, name);
    }

    public Monera(Boolean alive) {
        super(alive);
    }

    public Gardener getPrimaryCare() {
        return primaryCare;
    }
    public void setPrimaryCare(Gardener primaryCare) {
        this.primaryCare = primaryCare;
    }

    @Override
    public String toString() {
        return "Monera: " + super.toString();
    }
}
