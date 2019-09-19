package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht2 extends Applet {
    Label label;
    Button next;
    Button before;
    int tafel;
    int teller;

    public void init() {
        label = new Label("Klik op de knoppen om door de tafels 1 tot en met 10 te gaan.");
        next = new Button("Volgende");
        before = new Button("Vorige");
        next.addActionListener(new NextButton());
        before.addActionListener(new BeforeButton());
        tafel = 1;
        teller = 1;
        add(label);
        add(before);
        add(next);
    }

    public void paint(Graphics g) {
        int y = 25;

        while (teller <= 10) {
            y +=20;
            g.drawString(String.valueOf(teller) + "x" + String.valueOf(tafel) + "=" + tafel * teller,50,y);
            teller++;
        }
    }

    // Volgende Knop
    class NextButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tafel <10) {
                tafel ++;
            }
            else {
                tafel = 1;
            }
            teller = 1;
            repaint();
        }
    }

    // Vorige Knop
    class BeforeButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tafel == 1) {
                tafel = 10;
            }
            else {
                tafel --;
            }
            teller = 1;
            repaint();
        }
    }
}