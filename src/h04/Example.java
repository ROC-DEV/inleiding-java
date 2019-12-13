package h04;

import java.awt.*;
import java.applet.*;


public class Example extends Applet
{
    public void init() {
    }

    public void paint(Graphics g) {
setBackground(Color.BLUE);
g.setColor(Color.yellow);
g.drawRect(20,20,100,100);
g.fillRect(20,80,100,50);
    }
}

