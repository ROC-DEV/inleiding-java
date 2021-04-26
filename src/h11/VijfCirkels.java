package h11;

import java.applet.Applet;
import java.awt.*;

public class VijfCirkels extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 50;
        int x = 50;
        int width = 50;
        int height = 50;
        for(teller = 0; teller < 5; teller++) {
            height+=15;
            width+=15;
            g.drawOval(x,y,width,height);
            y+=-7;
            x+=-7;
        }

    }

}
