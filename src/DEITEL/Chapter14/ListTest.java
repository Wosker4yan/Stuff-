package DEITEL.Chapter14;

/**
 * Created by wosker4yan on 09.01.17.
 */
// Fig. 14.24: ListTest.java
// Selecting colors from a JList.
import javax.swing.JFrame;
public class ListTest
{
    public static void main( String[] args )
    {
        ListFrame listFrame = new ListFrame(); // create ListFrame
        listFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        listFrame.setSize( 350, 150 ); // set frame size
        listFrame.setVisible( true ); // display frame
    } // end main
} // end class ListTest