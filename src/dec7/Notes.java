package dec7;
import java.util.ArrayList;

/*
 * Study prep for final
 * final on dec 21 (thurs) @ 9:45am
 */
public class Notes {
    public static int f(int i) {
        int result; // fail state
        if (i == 0) {
            result =  0; // base case
        } else {
            result = i + f(i - 1);
        }
        return result;
    }

    public static int fInFor(int i) {
        int result = i;
        for(int j = 0; j < i; j++) {
            result += j;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));

        System.out.println(fInFor(1));
        System.out.println((fInFor(2)));
        System.out.println(fInFor(3));
        System.out.println(fInFor(4));

        BClass[] bArray = new BClass[10];
        ArrayList<CClass> cList = new ArrayList<>();
        ArrayList<AClass> aAll = new ArrayList<>();
        int i;
        final String DEFAULTNAME = "Billy Bob";
        final String DEFAULTCOLOR = "Blue";
        final String DEFAULTSURNAME = "Jim";

        /*
        ArrayList<String> arrayTest = new ArrayList<>();
        System.out.println("Initial: " + arrayTest.size());
        arrayTest.add("Booty");
        System.out.println("Post booty: " + arrayTest.size());
        */

        for(i = 0; i < bArray.length; i++) {
            bArray[i] = new BClass(DEFAULTNAME, i, DEFAULTCOLOR);
        }
        for(i = 0; i < bArray.length; i++) {
            cList.add(new CClass(DEFAULTNAME, i, DEFAULTSURNAME));
        }

        for(i = 0; i < bArray.length; i++) {
            aAll.add(bArray[i]);
        }
        aAll.addAll(cList);
        aAll.trimToSize();

        bArray[0].setColor("Red");

        for(i = 0; i < aAll.size(); i++) {
            System.out.println(aAll.get(i).toString());
        }
    }
}
