package h04;

import java.awt.*;
import javax.swing.*;

public class HuisMetRaamEnDeur extends JApplet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(50,50,40,40);
        g.drawLine(50,50,70,30);
        g.drawLine(70,30,90,50);
        g.drawRect(75,70,8,20);
        g.drawRect(60,75,8,8);
    }

}
