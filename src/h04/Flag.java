package h04;

import javax.swing.*;
import java.awt.*;
import java.applet.*;


public class Flag extends Applet {

    public void init() {

        setSize(200, 200);

    }

    public void paint(Graphics g) {


        g.drawLine(280, 340, 280, 180);

        g.setColor(Color.BLUE);
        g.fillRect(280, 140, 160, 40);
        g.setColor(Color.WHITE);
        g.fillRect(280, 100, 160, 40);
        g.setColor(Color.RED);
        g.fillRect(280, 60, 160, 40);

    }
}

