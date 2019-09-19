package h05;
import javax.swing.*;
import java.awt.*;
import java.applet.*;


public class h5_2 extends Applet {

    int JeroenGewicht;
    int HansGewicht;
    int ValerieGewicht;

    int hoogteXAs;

    public void init() {

        hoogteXAs = 360;
        setSize(800, 800);
        setBackground(Color.white);

        JeroenGewicht = 100;
        HansGewicht = 80;
        ValerieGewicht = 40;

    }
    public void paint (Graphics g){

        g.drawLine(140, hoogteXAs, 140, 150);
        g.drawLine(340,hoogteXAs,140,hoogteXAs);

        g.drawString("0",110, 370);
        g.drawString("20",110,345);
        g.drawString("40",110,327);
        g.drawString("60",110,306);
        g.drawString("80",110, 285);
        g.drawString("100", 110,263);

        g.drawString("jeroen",140,380);
        g.drawString("Valerie",190,380);
        g.drawString("Hans",240,380);

        g.setColor(Color.BLACK);
        g.fillRect(140,hoogteXAs - JeroenGewicht,50, JeroenGewicht);
        g.setColor(Color.RED);
        g.fillRect(190,hoogteXAs - HansGewicht,50,HansGewicht);
        g.setColor(Color.yellow);
        g.fillRect(240,hoogteXAs - ValerieGewicht,50,ValerieGewicht);



    }
}


