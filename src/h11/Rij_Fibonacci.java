package h11;

import java.applet.Applet;
import java.awt.*;

public class Rij_Fibonacci extends Applet {

    int getal = 0;
    int getal2 = 1;
    int som = getal + getal2;
    int y = 20;
    String teken = "1";

    @Override
    public void paint(Graphics g) {
        g.drawString(teken,10,20);
        for (int i = 0; i < 20; i++) {
            y+= 20;
            g.drawString("" + som,10,y);
            getal = getal2;
            getal2 = som;
            som = getal + getal2;
            i++;
        }
    }
}

