package dec7;

public class CClass extends AClass {
    private String surName;

    public CClass(String name, int idNo, String surName) {
        super(name, idNo);
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        super.logChange(this.surName, surName);
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "CClass{" +
                "surName='" + surName + '\'' +
                "} " + super.toString();
    }
}
