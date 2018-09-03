package h04;

import java.awt.*;
import java.applet.*;

// DIT IS OPDRACHT 4.2

public class Huisje extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(500, 400, 400, 500); //diagonaal 1
        g.drawLine(500, 400, 600, 500); //diagonaal 2
        g.drawLine(600, 500, 400, 500); //onderste lijn
        g.drawRect(400, 500, 200, 250); //huis base
        g.drawRect(440, 650, 50, 100); //deur
        g.drawRect(550, 560, 30, 30); //raam
        }
        }