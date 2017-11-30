package nov30;

public class Main {
    public static void main(String[] args) {
        Monera m = new Monera(Boolean.TRUE, "Single Cell Organism");
        System.out.println(m);

        Doctor d1 = new Doctor();
        Doctor d2 = new Doctor("Dr Bettencourt");
        Gardener g1 = new Gardener();
        Animal a1 = new Animal(true, "Dog", d1);

        System.out.println(a1);
        m.setPrimaryCare(g1);
        System.out.println("" + d1 + d2);
    }
}
