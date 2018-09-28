package h11;

import java.awt.*;
import java.applet.*;


public class Fibonacci extends Applet {

    public void init() {}

    int y = 20;

    public void paint(Graphics g) {
        int f =  0;
        int f1 = 0;
        int f2 = 1;



        for (int teller = 1; teller <= 20; teller++) {
            f = f2 + f1;
            f2 = f1;
            f1 = f;

            g.drawString("" + f, 20, y);
            y += 20;
        }

    }}
