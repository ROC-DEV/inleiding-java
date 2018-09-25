package h11;

import java.awt.*;
import java.applet.*;


public class Schaakbord extends Applet {

    public void init() {}

    public void paint(Graphics g) {


        int x = 50;
        int y = 50;
        int breedte = 50;
        int hoogte = 50;
        setBackground(Color.gray);

        for (int teller2 = 0; teller2 < 4; teller2++) {


        for (int teller = 0; teller < 8; teller++) {

            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }

            x += breedte;


        }

        x = 50;
        y += hoogte;


        for (int teller = 0; teller < 8; teller++) {

            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            x += breedte;

        }
            x = 50;
            y += 50;  } }}
