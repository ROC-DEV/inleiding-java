package h04;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet{

    public void init() {

        setSize(1200, 1200);
        setBackground(Color.WHITE);

    }
    public void paint (Graphics g){


        g.drawLine(140, 250, 140, 90);


        g.drawString("0",110,250);
        g.drawString("20",110,220);
        g.drawString("40",110,190);
        g.drawString("60",110,162);
        g.drawString("80",110,135);
        g.drawString("100",110,100);


        g.drawString("jeroen",140,270);
        g.drawString("Valerie",190,270);
        g.drawString("Hans",240,270);


        g.drawLine(350,250,140,250);


        g.setColor(Color.BLACK);
        g.fillRect(140,90,50,160);

        g.setColor(Color.red);
        g.fillRect(190,185,50,65);

        g.setColor(Color.yellow);
        g.fillRect(240,130,50,120);


    }

}
