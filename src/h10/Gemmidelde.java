package h10;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Gemmidelde extends Applet {

    Label label;
    TextField tekstvak;
    Button ok;
//    Button reset;
    double gemmidelde;
    double getalinput;
    double cijferinput;
    String tekstvakTekst;
    String s;
    String tekst;
    String uitslag;
    int teller;

    @Override
    public void init() {
        super.init();
        label = new Label("Vul hier je cijfer in:");
        ok = new Button("Uitslag");
        ok.addActionListener(new OkButtonListener());
//        reset = new Button("RESET");
//        reset.addActionListener(new ResetListener());
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstVakListener());

        tekst = "Nog geen getallen gedetecteerd.";
        uitslag = "Nog niet berekend.";
        cijferinput = 0;

        add(label);
        add(tekstvak);
        add(ok);
//        add(reset);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Je gemmidelde is:"+gemmidelde,50,70);
        g.drawString(tekst,50,55);
        g.drawString(uitslag,50,90);
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvakTekst = tekstvak.getText();
            getalinput = Double.parseDouble(tekstvakTekst);
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

    class OkButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            tekstvakTekst = tekstvak.getText();
//            gemmidelde = Double.parseDouble(tekstvakTekst);
            gemmidelde = cijferinput/teller;
            // Omrekenen naar 1 decimaal
            gemmidelde *= 10;
            gemmidelde = (int) gemmidelde;
            gemmidelde /= 10;

            if ( gemmidelde > 5.4 ) {
              s   = "Je hebt een voldoende.";
            }
            else {
              s   = "Je hebt een onvoldoende.";

            }
            repaint();
        }
    }
}

//class ResetListener implements ActionListener {
//    public void actionPerformed(ActionEvent e) {
//        getClass(Gemmidelde);
//        // Getallen Resetten
//        gemiddelde = 0.0;
//        teller = 0;
//        cijferinput = 0.0;
//        getalinput = 0.0;
//        // Tekstvakken Resetten
//        tekstvak.getText();
//        tekstvak.setText("");
//        // Strings Resetten
//        tekst = "Nog geen getallen gedetecteerd.";
//        uitslag = "Nog niet berekend.";
//        repaint();
//    }
//}