package h11;

import java.applet.Applet;
import java.awt.*;

public class Rij_Fibonacci extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int y = 0;
        int som;
        for(teller = 1; teller < 1000; teller++,som = teller+teller) {
            y+=20;
            g.drawString("" + teller,30,y);
        }

    }

}
