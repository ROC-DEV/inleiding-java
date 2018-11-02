package h13;

import java.applet.Applet;
import java.awt.*;


public class Bakstenen extends Applet {

    int y1 = 45;
    int y2 = 70;


    public void init() {

        setSize(800, 600);

    }

    public void paint(Graphics g) {

        tekenMuur(g);

    }

    public void tekenMuur(Graphics g) {

        g.setColor(Color.RED);
        int i;
        int i2 = 0;

        for (i = 0; i < getWidth() / 50; i++) {

            g.fillRect(-50 + (i * 55), y1, 50, 20);
            g.fillRect(-75 + (i * 55), y2, 50, 20);

            if (i == (getWidth() / 50) - 1 && i2 < 8) {
                y1 = y2 + 25;
                y2 = y2 + 50;
                i = 0;
                i2++;
            }
        }
    }
}