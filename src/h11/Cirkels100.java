package h11;

import java.awt.*;
import java.applet.*;


public class Cirkels100 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int wh = 10;
        int xy = 200;

        for( int teller = 0; teller < 100; teller++) {
            wh += 7;

            g.drawArc(100, 100, wh, wh, 0,360);
        }
    }
}
