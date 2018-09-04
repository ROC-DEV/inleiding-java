package h05;

import java.awt.*;
import java.applet.*;

// DIT IS OPDRACHT 5.1

public class PraktijkopdrachtNieuw extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int hoogte;
    int breedte;

    public void init() {

        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        hoogte = 150;
        breedte = 300;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(lijnkleur);

        g.drawLine(20, 20, 320, 20);
        g.drawString("Lijn", hoogte, 35);

        g.drawRect(20, 70, breedte, hoogte);
        g.drawString("Rechthoek", 140, 235);

        g.setColor(opvulkleur);
        g.fillRect(340, 70, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(340, 70, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 420, 235);

        g.setColor(opvulkleur);
        g.fillArc(660, 70, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(660, 70, breedte, hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 740, 235);

        g.drawRoundRect(20,260, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 110, 430);

        g.setColor(opvulkleur);
        g.fillOval(340, 260, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 430, 430);

        g.drawOval(740, 260, hoogte, hoogte);
        g.drawString("Cirkel",800, 430);


    }}