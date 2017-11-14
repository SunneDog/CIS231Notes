package nov14;

public class Parent {
    public int i;
    public static int c;
    static {
        c = 10;
        System.out.println(c);
    }

    public Parent() { // i is an instance variable
        this.i = 0;
        Parent.c = 6;
    }
}
