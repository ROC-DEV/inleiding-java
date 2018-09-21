package h10;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HoogsteGetal extends Applet {

    TextField tekstvak;

    double n;
    double getal;
    String s;




public void init() {


    tekstvak = new TextField("" , 20);
    s = "";
    n = 0;
    getal = 0;
    add(tekstvak);

    tekstvak.addActionListener( new TekstvakListener() );




}

public void paint (Graphics g) {

    g.drawString("Hoogste getal: " + n, 20, 100);
    g.drawString("Typ een getal en druk op enter,", 40, 40);
    g.drawString("het hoogste getal verschijnt op het scherm.", 40, 60);
        }

class TekstvakListener implements ActionListener {
    public void actionPerformed( ActionEvent e) {


        s = tekstvak.getText();
        getal = Double.parseDouble(s);

        if ( getal > n ) {
            n = Integer.valueOf(s);

            repaint();
        }
    }}}

