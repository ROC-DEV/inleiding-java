package h11;

import java.awt.*;
import java.applet.*;


public class Cirkels5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int wh = 20;
        int xy = 150;

        for( int teller = 0; teller < 5; teller++) {
            wh += 20;
            xy -= 10;

            g.drawArc(xy, xy, wh, wh, 0,360);
        }
    }
}
