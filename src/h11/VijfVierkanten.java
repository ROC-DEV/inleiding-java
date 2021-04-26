package h11;

import java.applet.Applet;
import java.awt.*;

public class VijfVierkanten extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 50;
        int x = 50;
        int heigth = 25;
        int width = 25;
        for(teller = 0; teller < 5; teller++) {
            x+=width;
            y+=heigth;
            g.drawRect(x,y,width,heigth);
        }

    }

}
