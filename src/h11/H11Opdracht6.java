package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht6 extends Applet {
    int teller;
    int x;
    int y;
    int w;
    int h;
    public void init() {
        x = 100;
        y = 100;
        w = 0;
        h = 0;


    }
    public void paint(Graphics g) {


        for(teller = 0; teller < 5; teller++) {
            x -= 5;
            y -= 5;
            w += 10;
            h += 10;



            g.drawOval(x, y, w, h);

        }
    }
}


