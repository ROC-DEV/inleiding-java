package h14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Delen extends Applet {

    String[] kleur = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] nummer = {" twee", " drie", " vier", " vijf", " zes", " zeven", " acht", " negen", " tien",
            " boer", " heer", " vrouw", " aas"};

    String[] deck;
    int kaartDelen;

    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;

    int kaarten;


    public void init() {

        setSize(800, 400);

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        deck = new String[52];
        Double random = Math.random();
        kaartDelen = (int) (random * 52);

        int index = 0;
        for (int i = 0; i < kleur.length; i++) {
            for (int j = 0; j < this.nummer.length; j++) {
                deck[index] = kleur[i] + this.nummer[j];
                index += 1;
            }
        }


        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];


        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {

        double random = Math.random();
        kaarten = (int) (random * deck.length);
        for (int i = 0; i < 13; i++) {

            int y = 50;

            g.drawString("Speler 1", 50, y - 20);
            g.drawString("Speler 2", 250, y - 20);
            g.drawString("Speler 3", 450, y - 20);
            g.drawString("Speler 4", 650, y - 20);

            g.drawString(speler1[i], 50, y + 20 * i);
            g.drawString(speler2[i], 250, y + 20 * i);
            g.drawString(speler3[i], 450, y + 20 * i);
            g.drawString(speler4[i], 650, y + 20 * i);
        }

    }
}


