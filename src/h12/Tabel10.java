package h12;

import java.awt.*;
import java.applet.*;

public class Tabel10 extends Applet {
    double[] getal;
    double optel;


    public void init() {
        optel = 0;

        getal = new double[10];


        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 10 * teller + 10;
            optel = optel + getal[teller];
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {

            g.drawString("" + getal[teller], 70, 20 * teller + 20);
            g.drawString("" + (optel) / 10,130,100);
        }
    }
}