package nov14;

public class Notes {
    /*
     * INCREMENT/DECREMENT
     *      i++ vs ++i
     *          i++ applies afterward, equivalent: i = i + 1 AFTER ;
     *          ++i applies beforehand, equivalent: i + 1 BEFORE ;
     *              Same for --
     *
     * TYPES
     *      primitives
     *      (numbers)
     *          short
     *          int
     *          long
     *          float
     *          double
     *       --------
     *          char
     *              a single character. ie: 'a', 'b', 'c'
     *          boolean
     *              true or false. 1 Byte with value 1 or 0
     *
     * CLASS V OBJECT
     *      Class:
     *          Blueprint, Definition
     *      Object:
     *          The actual THING.
     *              Animal Dog = new Animal("Canine");
     *                  Animal is the Class
     *                  Dog is the Object
     *
     * INSTANCE
     *      Version of a variable belonging to a specific object.
     *          Dictionary a2b.HashMap is different from Dictionary b2c.HashMap
     *
     * NUMBER SYSTEMS
     *          DECIMAL {0,...,9} || BINARY {0.1}
     *              0                    0
     *              1                    1
     *              2                   10
     *              3                   11
     *              4                  100
     *              5                  101
     *              6                  110
     *              7                  111
     *              8                 1010
     *              9                 1001
     *             10                 1010
     *           ================================
     *           Binary numbers that are EVEN (2,4,6,...) end in a 0.
     *           TO CONVERT DECIMAL TO BINARY:
     *              1. Divide the number by 2.
     *              2. Get the integer quotient for the next iteration.
     *              3. Get the remainder for the hex digit.
     *              4. Repeat the steps until the quotient is equal to 0.
     *
     *          _13_|_Quotient_|_Remainder_|_Bit #_
     *          13/2|____6_____|_____1_____|___0___
     *          _6/2|____3_____|_____0_____|___1___
     *          _3/2|____1_____|_____1_____|___2___
     *          _1/2|____0_____|_____1_____|___3___
     *
     *               Decimal 13 = Binary 1011
     *
     * TERNARY (? || :)
     *      standard:
     *          if(x == 1) { f(); } else { g(); }
     *      ternary:
     *          (x == 1) ? f() : g() ;
     */


    public static void main(String[] args) {
        Parent dad = new Parent();
        System.out.println(dad.c);
    }
}
