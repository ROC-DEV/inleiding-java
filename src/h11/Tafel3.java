package h11;

import java.awt.*;
import java.applet.*;


public class Tafel3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 20;
        int getal = 0;
        int keer = 3;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            getal += 1;
            g.drawString(keer + "*" + getal + "=" + (getal*keer) , 20, y);
        }
    }
}
