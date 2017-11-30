package nov28;
import java.util.ArrayList;

public class Notes {
    /*
     * ARRAYLIST VS ARRAY
     *      ArrayList
     *          Pseudo-dynamic, can change size by copying array within it to a larger array containing the same values
     *          Can be declared for a class type using <>
     *      Array
     *          Nondynamic, contained within ArrayList, stays one static size.
     *
     *      Both are modular, editing an array in a method edits it everywhere
     */
    public static void main(String[] args) {
        ArrayList<String> al;
        al = new ArrayList<>();

        String[] a = new String[20];

        for(String w : al) {
            // how to: iterate thru arraylist
            // classically:
            // for(int i = 0; i < a.size; i++) {System.out.println(al.get(i)}
            System.out.println(w);
        }

        Hauler h = new Hauler();
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(h + "\n" + c1 + "\n" + c2);

    }
}
