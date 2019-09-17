package h11;

import java.applet.Applet;
import java.awt.*;

public class TafelDrie extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 0;
        for(teller = 3; teller < 31; teller++,teller++,teller++) {
            y+=20;
            g.drawString("" + teller,30,y);
        }

    }

}
