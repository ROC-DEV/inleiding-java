package h04;

import java.awt.*;
import javax.swing.*;

public class GelijkBenigeDriehoek extends JApplet {

    public void init() {
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawLine(20, 20, 30, 30);
        g.drawLine(30,30,10,30);
        g.drawLine(10,30,20,20);
    }
}
