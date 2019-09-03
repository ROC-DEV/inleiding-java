package h02;

import java.awt.*;
import javax.swing.*;

public class Applet_YellowName extends JApplet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint (Graphics g)
    {
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.drawString("Liam van Slingerlandt", 50, 60);
    }

}
