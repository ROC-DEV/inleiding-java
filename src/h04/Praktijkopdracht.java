package h04;

import java.awt.*;
import java.applet.*;


public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawLine(20, 20, 320, 20);
        g.drawString("Lijn", 150, 35);

        g.drawRect(20, 70, 300, 150);
        g.drawString("Rechthoek", 140, 235);

        g.setColor(Color.magenta);
        g.fillRect(340, 70, 300, 150);
        g.setColor(Color.black);
        g.drawOval(340, 70, 300, 150);
        g.drawString("Gevulde rechthoek met ovaal", 420, 235);

        g.setColor(Color.magenta);
        g.fillArc(660, 70, 300, 150, 0, 45);
        g.setColor(Color.black);
        g.drawOval(660, 70, 300, 150);
        g.drawString("Taartpunt met ovaal eromheen", 740, 235);

        g.drawRoundRect(20,260, 300, 150, 30, 30);
        g.drawString("Afgeronde rechthoek", 110, 430);

        g.setColor(Color.magenta);
        g.fillOval(340, 260, 300, 150);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 430, 430);

        g.drawOval(740, 260, 150, 150);
        g.drawString("Cirkel",800, 430);


    }}