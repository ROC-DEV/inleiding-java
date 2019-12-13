package h04;

import java.awt.*;
import java.applet.*;

public class Triangle extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(20, 150, 100, 20);
        g.drawLine(180, 150, 100, 20 );
        g.drawLine(20, 150, 180, 150);
    }
}
