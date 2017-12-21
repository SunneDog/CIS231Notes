package dec14;

public class Dec14Class implements Dec14Interface {
    static Integer counter ;
    static { counter = 0; }
    final Integer FI = 5;

    public Dec14Class() {

    }

    @Override
    public final Integer f() { // final: no children of Dec14Class can alter this method
     Integer result = 0;

     return result;
    }
    @Override
    public Double g() {
        Double result = 0.0;

        return result;
    }
}
