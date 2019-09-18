package h11;

import java.applet.Applet;
import java.awt.*;

public class SchaakBord extends Applet {

    int y;
    int x;
    int breedte;
    int hoogte;

    public void paint(Graphics g) {
        setBackground(Color.gray);
        y = 50;
        x = 50;
        breedte = 30;
        hoogte = 30;

        for(int i=0;i<4;i++) {
            Rij(g, Color.BLACK, Color.WHITE);
            Rij(g, Color.WHITE, Color.BLACK);
        }
    }

    private void Rij(Graphics g, Color startkleur, Color tweedekleur) {
        for (int kolom = 0; kolom < 8; kolom++) {

            Color kleur;
            int oneven = kolom % 2;
            if(oneven==0)
                kleur = startkleur;
            else
                kleur = tweedekleur;

            g.setColor(kleur);
            g.fillRect(x, y, breedte, hoogte);
            x += breedte;
        }

        x = 50;
        y += hoogte;
    }
}


