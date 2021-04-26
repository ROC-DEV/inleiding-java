package h11;

import java.applet.Applet;
import java.awt.*;

public class TwintigTotTien extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 0;
        for(teller = 10; teller < 21; teller++) {
            y+=20;
            g.drawString("" + teller,30,y);
        }

    }

}
