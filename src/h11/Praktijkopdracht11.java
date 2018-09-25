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

        g.drawString("" + tekst, 50, 80 );

        int teller;
        int y = 20;

        int getal = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            getal += 1;
            g.drawString(tekst + "*" + getal + "=" + (getal*tekst) , 50, y);
        }}

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            getal = Integer.parseInt(s);

            switch(getal) {
                case 1:
                    tekst = 1;
                    break;
                case 2:
                    tekst = 2;
                    break;
                case 3:
                    tekst = 3;
                    break;
                case 4:
                    tekst = 4;
                    break;
                case 5:
                    tekst = 5;
                    break;
                case 6:
                    tekst = 6;
                    break;
                case 7:
                    tekst = 7;
                    break;
                case 8:
                    tekst = 8;
                    break;
                case 9:
                    tekst = 9;
                    break;
                case 10:
                    tekst = 10;
                    break;
                default:
                    tekst = 0;
                    break;
            }
                    repaint();
            }}}


  /*  public void paint(Graphics g) {

        g.drawString("" + tekst, 50, 80 );

        int teller;
        int y = 20;

        int getal = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            getal += 1;
            g.drawString(tekst + "*" + getal + "=" + (getal*tekst) , 20, y);
        }
    }
}}


 */

