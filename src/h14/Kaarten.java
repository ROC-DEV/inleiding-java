package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Kaarten extends Applet {

    String[] getal;
    String[] soort;
    Button delen;

    public void init() {
        delen = new Button("Deel kaart.");
        delen.addActionListener(new Delen());

        soort =  new String[4];
        soort[0] = "Harten";
        soort[1] = "Klaver";
        soort[2] = "Ruiten";
        soort[3] = "Schoppen";

        getal = new String[14];
        getal[0] = "Een";
        getal[1] = "Twee";
        getal[2] = "Drie";
        getal[3] = "Vier";
        getal[4] = "Vijf";
        getal[5] = "Zes";
        getal[6] = "Zeven";
        getal[7] = "Acht";
        getal[8] = "Negen";
        getal[9] = "Tien";
        getal[10] = "Boer";
        getal[11] = "Koningin";
        getal[12] = "Koning";
        getal[13] = "Aas";

        add(delen);
    }

    public void paint(Graphics g) {
        int randomSoort = (int) (Math.random() * 4);
        int randomNummer = (int) (Math.random() * 14);
        g.drawString(""+ soort[randomSoort]+" "+ getal[randomNummer],20,40);
        System.out.println("Het kaart "+soort[randomSoort] + " " + getal[randomNummer]+" is uitgedeeld.");
    }

    class Delen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        repaint();
        }
    }
}