package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class Vijftekstvakken extends Applet {

    // Variablen Maken
    TextField[] tekstvak;
    int[] getallen;
    int y;
    Button knop;

    public void init() {

        // Variablen Instellen
        tekstvak = new TextField[5];
        getallen = new int[5];
        y = 60;
        knop = new Button("Ok");
        knop.addActionListener(new OkKnopListerner());
        add(knop);

        // Tekstvakken aanmaken
        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);

        }
    }

    // OkKnop Event
    class OkKnopListerner implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Getallen pakken uit de vakken
            for (int j = 0; j < getallen.length; j++) {
                getallen[j] = Integer.parseInt(tekstvak[j].getText());

            }

            Arrays.sort(getallen);

            // Getallen in juiste volgorde neerzetten
            for (int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText("");
                getGraphics().drawString("" + getallen[i], 50, y);
                y+=20;

            }
        }
    }
}