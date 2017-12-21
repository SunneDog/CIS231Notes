package dec21Final;

public class Main {
    public static void range(Integer start , Integer end , Integer delta) {
        //  LOOP HERE, printing each value in this integer range
        for(start = start; start < end; start += delta) {
            System.out.println(start);
        }
    }
    public static void main(String[] args) {
        range(1,10,3);
    }
}