package h04;

import java.awt.*;
import java.applet.*;

// DIT IS OPDRACHT 4.1

public class Opdracht1H4 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(500, 500, 400, 700);
        g.drawLine(500, 500, 600, 700);
        g.drawLine(600, 700, 400, 700);
    }
}