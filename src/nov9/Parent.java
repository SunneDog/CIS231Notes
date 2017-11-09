package nov9;

public class Parent {
    private int i;
    private Integer i2;
    private double d;
    private Double d2;

    public Parent() {
        System.out.println("Parent() constructor");
        this.d2 = new Double(0.0);
        this.d = 0.0;
        this.i2 = new Integer(0);
        this.i = 0;
    }
}
