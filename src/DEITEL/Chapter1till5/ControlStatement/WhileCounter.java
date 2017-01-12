package DEITEL.Chapter1till5.ControlStatement;

/**
 * Created by wosker4yan on 01.12.16.
 */
public class WhileCounter {
    public static void main( String[] args ){
    int counter = 1; // declare and initialize control variable
while ( counter <= 10 ) // loop-continuation condition
    {
        System.out.printf( "%d ", counter );
        ++counter; // increment control variable by 1
    } // end while
System.out.println(); // output a newline
} // end main
} // end class WhileCounter