package h11;

import java.applet.Applet;
import java.awt.*;

public class HonderdCirkels extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 500;
        int x = 700;
        int width = 8;
        int height = 8;
        for(teller = 0; teller < 100; teller++) {
            height+=8;
            width+=8;
            g.drawOval(x,y,width,height);
            y+=-4;
            x+=-4;
        }

    }

}
