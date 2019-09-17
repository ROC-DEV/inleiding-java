package h11;

import java.applet.Applet;
import java.awt.*;

public class VijfCirkels extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 0;
        int x = 0;
        int width = 50;
        int height = 50;
        for(teller = 0; teller < 5; teller++) {
            y+=1;
            x+=1;
            height+=20;
            width+=20;
            g.drawOval(x,y,width,height);
        }

    }

}
