package h11;

import java.awt.*;
import java.applet.*;


public class Lijnen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 100;
        int y2 = 20;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            y2 += 20;
            g.drawLine(50 , y, 300, y2);
        }
    }
}
