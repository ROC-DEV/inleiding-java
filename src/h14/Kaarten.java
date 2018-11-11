package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kaarten extends Applet {

    String[] kleur = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] nummer = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien",
            "boer", "heer", "vrouw", "aas"};

    String delen;

    public void init() {


        delen = "";
        Button kaart = new Button("Nieuwe kaart");
        kaart.addActionListener(new kaartListener());
        add(kaart);

    }


    public void paint(Graphics g) {
        g.drawString("" + delen,20, 60);
    }

    public class kaartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String keuze1 = kleur[(int) (Math.random() * kleur.length)];
            String keuze2 = nummer[(int) (Math.random() * nummer.length)];

            delen = keuze1 + " " + keuze2;
            repaint();

        }
    }
}
