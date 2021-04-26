package h11;

import java.applet.Applet;
import java.awt.*;

public class VijftigCirkels extends Applet {

    public void init() {
        setSize(1200, 1200);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 450;
        int x = 600;
        int width = 50;
        int height = 50;
        for(teller = 0; teller < 50; teller++) {
            height+=15;
            width+=15;
            g.drawOval(x,y,width,height);
            y+=-7;
            x+=-7;
        }
    }
}
