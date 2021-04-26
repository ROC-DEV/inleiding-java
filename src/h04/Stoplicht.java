package h04;

import java.awt.*;
import javax.swing.*;

public class Stoplicht extends JApplet {

    public void init() {

        this.setSize(400, 400);

    }

    public void paint(Graphics g) {
        super.paint(g);

        h04.Licht_2.Stoplicht light = new h04.Licht_2.Stoplicht(g);

        // Pole
        g.setColor(Color.BLACK);
        g.fillRect(80,50,15,200);
        g.fillRect(320,50,15,200);
        g.fillRect(80,50,240, 15);

        light.Draw(260,35);
        light.Draw(140,35);

 /*       // Light's
        g.fillOval(140,35,23,50);
        g.fillOval(260,35,23,50);

        g.setColor(Color.RED);
        g.fillArc(145,37,13,13,360,360);
        g.fillArc(265,37,13,13,360,360);

        g.setColor(Color.ORANGE);
        g.fillArc(145,52,13,13,360,360);
        g.fillArc(265,52,13,13,360,360);

        g.setColor(Color.GREEN);
        g.fillArc(145,67,13,13,360,360);
        g.fillArc(265,67,13,13,360,360);*/

    }


}
