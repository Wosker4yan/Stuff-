package DEITEL.Chapter14;

// Fig. 14.32: MouseDetails.java
// Testing MouseDetailsFrame.
import javax.swing.JFrame;
public class MouseDetails
{
    public static void main( String[] args )
    {
        MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        mouseDetailsFrame.setSize( 400, 150 ); // set frame size
        mouseDetailsFrame.setVisible( true ); // display frame
    } // end main
} // end class MouseDetails
