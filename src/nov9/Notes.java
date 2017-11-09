package nov9;

public class Notes {
    /*============================
     * Constructor
     *      Runs once when you use 'new'
     *      Default constructor = constructor with no parameters
     *      Can have any number of constructors, same rules as multiple methods with same name
     *      ie.
     *          String s = new String();
     *          String s = new String("Bob");
     *
     * this.i = child's i
     * super.i = parent's i
     *
     *============================*/
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Parent();
        Child c1 = new Child();
        Child c2 = new Child();
    }
}
