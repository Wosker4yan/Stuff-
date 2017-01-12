package DEITEL.Chapter8;

import javax.swing.*;

/**
 * Created by wosker4yan on 15.12.16.
 */
public class TestDraw {

        public static void main( String[] args )
        {
            DrawPanel panel = new DrawPanel();
            JFrame application = new JFrame();
            application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            application.add( panel );
            application.setSize( 300, 300 );
            application.setVisible( true );
        } // end main
    } // end class TestDraw

