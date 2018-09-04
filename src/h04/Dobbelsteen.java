package h04;


import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    // DIT IS OPDRACHT 4.7

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(200, 200, 300, 300);

        g.fillOval(230, 230, 80, 80);
        g.fillOval(230, 390, 80, 80);
        g.fillOval(390, 230, 80, 80);
        g.fillOval(390, 390, 80, 80);

    }}

