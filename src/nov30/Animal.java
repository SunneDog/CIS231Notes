package nov30;

public class Animal extends Organism {
    private Doctor primaryCare;

    public Animal(Boolean alive, String name, Doctor primaryCare) {
        super(alive, name);
        this.primaryCare = primaryCare;
    }

    public Doctor getPrimaryCare() {
        return primaryCare;
    }

    public void setPrimaryCare(Doctor primaryCare) {
        this.primaryCare = primaryCare;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnimal{" +
                "primaryCare=" + primaryCare +
                '}';
    }
}
