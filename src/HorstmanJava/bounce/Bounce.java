package HorstmanJava.bounce;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by wosker4yan on 27.11.16.
 */
public class Bounce
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
