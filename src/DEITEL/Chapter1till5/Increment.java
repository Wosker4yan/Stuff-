package DEITEL.Chapter1till5;

/**
 * Created by wosker4yan on 01.12.16.
 */// Fig. 4.15: Increment.java
// Prefix increment and postfix increment operators.
public class Increment
{
    public static void main( String[] args )
    {
        int c;
// demonstrate postfix increment operator
        c = 5; // assign 5 to c
        System.out.println( c );
// prints 5
        System.out.println( c++ ); // prints 5 then postincrements
        System.out.println( c );
// prints 6
        System.out.println(); // skip a line
// demonstrate prefix increment operator
        c = 5; // assign 5 to c
        System.out.println( c );
// prints 5
        System.out.println( ++c ); // preincrements then prints 6
        System.out.println( c );
// prints 6
    } // end main
} // end class Increment

