package h11;

import java.awt.*;
import java.applet.*;


public class Cirkels50 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int wh = 10;
        int xy = 500;

        for( int teller = 0; teller < 50; teller++) {
            wh += 10;
            xy -= 5;

            g.drawArc(xy, xy, wh, wh, 0,360);
        }
    }
}
