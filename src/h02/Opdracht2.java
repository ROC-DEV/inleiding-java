package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    // DIT IS OPDRACHT 2.2
    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Kaj", 50, 50);
        g.setColor(Color.red);
        g.drawString("Rooze", 50, 60);
    }
}


