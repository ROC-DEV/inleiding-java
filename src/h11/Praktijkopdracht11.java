package h11;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht11 extends Applet {


    TextField tekstvak;
int tekst;
String s;
int getal;

    public void init() {


        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);


    }

    public void paint(Graphics g) {

        //g.drawString("" + tekst, 50, 80 );

        int teller;
        int y = 40;

        int getal = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            getal += 1;
            g.drawString(getal + " * " + tekst + " = " + (getal*tekst) , 120, y);
        }}

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            getal = Integer.parseInt(s);

            tekst = getal;

            repaint();

        }}}

