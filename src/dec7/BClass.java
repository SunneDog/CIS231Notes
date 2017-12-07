package dec7;

public class BClass extends AClass {
    private String color;

    public BClass(String name, int idNo, String color) {
        super(name, idNo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        super.logChange(this.color, color);
        this.color = color;
    }

    @Override
    public String toString() {
        return "BClass{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
