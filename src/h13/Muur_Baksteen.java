package h13;

import java.applet.*;
import java.awt.*;

public class Muur_Baksteen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        tekenMuur(g,5,5);
    }

    void tekenMuur(Graphics g, int hoogteMuur, int breedteMuur) {
        int teller=0;
        int x, y=20, breedte=50, hoogte=25, breedteEind=25;
        int beginX;
        Color black=Color.BLACK;
        Color red=Color.RED;

        while (teller < hoogteMuur) {
            x=50;
            beginX = 50 + breedteEind;

            if (teller % 2 == 0) {
                for (int i=0; i < breedteMuur; i++) {
                    if (i == 0 || i == breedteMuur-1) {
                        g.setColor(black);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(red);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = 50* breedteMuur;
                    } else {
                        g.setColor(black);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(red);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= 50+25;
                for (int i = 0; i < breedteMuur-1; i++) {
                    g.setColor(black);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(red);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            teller++;
            y+=hoogte;
        }
    }
}