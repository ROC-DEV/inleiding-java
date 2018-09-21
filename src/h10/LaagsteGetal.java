package h10;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LaagsteGetal extends Applet {

    TextField tekstvak;

    int n;
    int o;
    int getal;
    int getal2;

    String s;
    String y;
    String p;
    String r;




    public void init() {


        tekstvak = new TextField("" , 20);
        s = "";
        y = "";


        p = "";
        r = "";

        n = 2147483647;
        o = 0;

        getal = 0;
        getal2 = 0;

        add(tekstvak);

        tekstvak.addActionListener( new TekstvakListener() );


    }

    public void paint (Graphics g) {

        g.drawString("Hoogste getal: " + p, 20, 100);
       g.drawString("Laagste getal: " + r, 20, 120);

        g.drawString("Typ een getal en druk op enter,", 40, 40);
        g.drawString("het hoogste en het laagste getal verschijnen op het scherm.", 40, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {

            s = tekstvak.getText();
            y = tekstvak.getText();
            getal = Integer.parseInt(s);
            getal2 = Integer.parseInt(y);

            p = Integer.toString(o);
            r = Integer.toString(n);

            repaint();


            if (getal < n) {
                n = Integer.valueOf(s);
                r = Integer.toString(n);

                repaint();
            }

            if (getal2 > o) {
                o = Integer.valueOf(y);
                p = Integer.toString(o);



                repaint();
            }

        }}}



