package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet
{

    // DIT IS OPDRACHT 4.6

        public void init() {}

        public void paint(Graphics g) {

            setBackground(Color.white);
            g.setColor(Color.black);
            g.fillRect(400, 20, 100, 300);
            g.fillRect(440, 320, 20, 200);
            g.fillRect(400, 500, 100, 20);

            g.setColor(Color.red);
            g.fillOval(410, 40, 80, 80); //bovenste
            g.setColor(Color.orange);
            g.fillOval(410, 130, 80, 80); //midden
            g.setColor(Color.green);
            g.fillOval(410, 220, 80, 80); //onder


}}
