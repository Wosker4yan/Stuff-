package DEITEL.Chapter14;
// Fig. 14.10: TextFieldTest.java
// Testing TextFieldFrame.
import javax.swing.JFrame;
public class TextFieldTest
{
    public static void main( String[] args )
    {
        TextFieldFrame1 textFieldFrame1 = new TextFieldFrame1();
        textFieldFrame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        textFieldFrame1.setSize( 350, 100 ); // set frame size
        textFieldFrame1.setVisible( true ); // display frame
    } // end main
} // end class TextFieldTest
