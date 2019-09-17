package h11;

import java.applet.Applet;
import java.awt.*;

public class VerticaleLijnen extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int x = 0;
        for(teller = 1; teller < 11; teller++) {
            x+=20;
            g.drawLine(x,50,x,300);
            g.drawString("" + teller,x,40);
        }

    }

}
