package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Gemmidelde extends Applet {
    Label label;
    TextField tekstvak;
    Button knop, reset;
    String s, tekst, uitslag;
    double cijferinput, gemiddelde, getalinput;
    int teller;

    public void init() {
        label = new Label("Hier cijfers:");
        tekstvak = new TextField("",15);
        knop = new Button("Ok");
        reset = new Button("Reset");
        reset.addActionListener(new ResetListener());
        knop.addActionListener(new KnopListener());
        tekstvak.addActionListener(new TekstvakListener());
        cijferinput = 0;
        tekst = "Geen getallen ingevuld.";
        uitslag = "Niet berekend.";
        add(label);
        add(tekstvak);
        add(reset);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Gemiddelde is: "+gemiddelde,135,70);
        g.drawString(tekst,135,55);
        g.drawString(uitslag,135,90);
    }
    // Input Lezer
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getalinput = Double.parseDouble(s);
            teller++;
            cijferinput += getalinput;
            if (getalinput >= 5.5) {
                tekst = "Het cijfer: " +getalinput + " is voldoende.";
            }
            else {
                tekst = "Het cijfer: " +getalinput +" is onvoldoende";
            }
            tekstvak.setText("");
            repaint();
        }
    }
    // Uitslag
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gemiddelde = cijferinput/teller;

            gemiddelde *= 10;
            gemiddelde = (int) gemiddelde;
            gemiddelde /= 10;

            if (gemiddelde >= 5.5) {
                uitslag = "Je bent geslaagd als een CHAMP.";
            }
            else {
                uitslag = "Je bent niet geslaagd als een LOSER.";
            }
            repaint();
        }
    }
    // ResetKnop
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gemiddelde = 0.0;
            teller = 0;
            cijferinput = 0.0;
            getalinput = 0.0;
            tekstvak.getText();
            tekstvak.setText("");
            tekst = "Geen getallen ingevuld.";
            uitslag = "Niet berekend.";
            repaint();
        }
    }
}