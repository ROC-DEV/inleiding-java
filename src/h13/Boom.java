package h13;

import java.applet.Applet;
import java.awt.*;

public class Boom extends Applet {

    public void init() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {

        tekenBoom(g, 50, 50, 20, 90);
    }

    private void tekenBoom(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.orange);
        g.fillRect(x1, y1, x2, y2+20);
        g.setColor(Color.green);
        g.fillOval(x1-35, y1-50, x2+70, y2);
    }

}