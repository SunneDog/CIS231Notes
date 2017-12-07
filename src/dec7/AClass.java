package dec7;

/*
 * Parent class
 */

public class AClass {
    private String name;
    private int idNo;

    public AClass(String name, int idNo) {
        this.name = name;
        this.idNo = idNo;
    }

    protected void logChange(Object from, Object to) {
        System.out.println("Object ID: " + idNo + "\nChanged " + from.toString() + " to " + to.toString() + "\n");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        logChange(this.name, name);
        this.name = name;
    }

    public int getIdNo() {
        return idNo;
    }
    public void setIdNo(int idNo) {
        logChange(this.idNo, idNo);
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "AClass{" +
                "name='" + name + '\'' +
                ", idNo=" + idNo +
                '}';
    }
}