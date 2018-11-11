package h13;

import java.applet.Applet;
import java.awt.*;

public class Boomgaard extends Applet {

    int y = 50;
    int x = 50;

    public void init() {
        setSize(600, 400);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 5; ) {
            tekenBoom(g, x, y, 20, 90); // bovenste rij
            tekenBoom(g, x, y + 120, 20, 90); // onderste rij
            x = x + 80;
            i++;
        }
    }

    private void tekenBoom(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.orange);
        g.fillRect(x1, y1, x2, y2 + 20);
        g.setColor(Color.green);
        g.fillOval(x1 - 35, y1 - 50, x2 + 70, y2);
    }

}