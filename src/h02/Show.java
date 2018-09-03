package h02;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    // DIT IS OPDRACHT 2.1
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Kaj Rooze", 50, 60);
    }
}


