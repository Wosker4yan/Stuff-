package DEITEL.Chapter1till5.ControlStatement;

/**
 * Created by wosker4yan on 02.12.16.
 */
public class DoWhileTest
{
    public static void main( String[] args )
    {
        int counter = 1; // initialize counter
        do
        {
            System.out.printf( "%d ", counter );
            ++counter;

        } while ( counter <= 10 ); // end do...while
        System.out.println(); // outputs a newline
    } // end main
} // end class DoWhileTest