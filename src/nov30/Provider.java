package nov30;

public class Provider {
    private String name;

    public Provider(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                '}';
    }
}
