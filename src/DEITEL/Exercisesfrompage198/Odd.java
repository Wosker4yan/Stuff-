package DEITEL.Exercisesfrompage198;

/**
 * Created by wosker4yan on 03.12.16.
 */
// Exercise 5.12 Solution: Odd.java
// Program prints the product of the odd integers from 1 to 15
public class Odd
{
    public static void main( String args[] )
    {
        int product = 1; // the product of all the odd numbers

        // loop through all odd numbers from 3 to 15
        for ( int x = 3; x <= 15; x += 2 )
            product *= x;

        // show results
        System.out.printf( "Product is %d\n", product );
    } // end main
} // end class Odd
