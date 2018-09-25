package h11;

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int getal = 21;
        int y = 20;

        for(teller = 0; teller < 11; teller++) {
            getal -= 1;
            y += 15;
            g.drawString("" + getal, 20, y);
        }
    }
}
