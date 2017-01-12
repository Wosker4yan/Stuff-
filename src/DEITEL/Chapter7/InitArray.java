package DEITEL.Chapter7;

/**
 * Created by wosker4yan on 08.12.16.
 */
public class InitArray {
    public static void main( String[] args )
    {
        int[] array = new int[ 10 ]; // declare array named array
        int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };// initializer list specifies the value for each element
        System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
            // output each array element's value
        for ( int counter = 0; counter < array.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array[ counter ] );
        for ( int counter = 0; counter < array2.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array2[ counter ] );
    } // end main
} // end class InitArray


