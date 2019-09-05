package h04;

import java.awt.*;
import javax.swing.*;

public class DrieKinderen extends JApplet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Chart
        g.setColor(Color.BLACK);
        g.drawRect(0,220,400,10);
        g.fillRect(0,220,400,10);
        g.drawRect(70,0,10,400);
        g.fillRect(70,0,10,400);

        // Names
        g.setColor(Color.RED);
        g.drawString("Valerie",90,245);
        g.drawString("Jeroen",150,245);
        g.drawString("Hans",210,245);

        // Numbers
        g.setColor(Color.BLACK);
        g.drawString("200",30,10);
        g.drawString("180",30,30);
        g.drawString("160",30,50);
        g.drawString("140",30,70);
        g.drawString("120",30,90);
        g.drawString("100",30,110);
        g.drawString("80",30,130);
        g.drawString("60",30,150);
        g.drawString("40",30,170);
        g.drawString("20",30,190);
        g.drawString("0",30,210);

        // Balks
        g.setColor(Color.GREEN);
        g.drawRect(93,170,20,49);
        g.fillRect(93,170,20,49);

        g.setColor(Color.YELLOW);
        g.drawRect(153,110,20,109);
        g.fillRect(153,110,20,109);

        g.setColor(Color.BLUE);
        g.drawRect(213,130,20,89);
        g.fillRect(213,130,20,89);


    }

}
