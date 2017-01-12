package DEITEL.Chapter1till5.ControlStatement;

/**
 * Created by wosker4yan on 02.12.16.
 */
public class ForCounter
{
    public static void main( String[] args )
    {
// for statement header includes initialization,
// loop-continuation condition and increment
        for ( int counter = 1; counter <= 10; counter++ )
            System.out.printf( "%d ", counter );
        System.out.println(); // output a newline
    } // end main
} // end class ForCounter