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


            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }

            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;
    }
}


