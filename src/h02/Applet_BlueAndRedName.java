package h02;

import java.awt.*;
import javax.swing.*;

public class Applet_BlueAndRedName extends JApplet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint (Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawString("Liam", 50, 60);
        g.setColor(Color.RED);
        g.drawString("van Slingerlandt", 50, 70);
    }

}
