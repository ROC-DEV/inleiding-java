package h11;

import java.awt.*;
import java.applet.*;


public class Vierkanten extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int teller;
        int xy = 30;


        for(teller = 0; teller < 5; teller++) {

            g.drawRect(xy, xy, 30, 30);
            xy += 30;


        }
    }
}
