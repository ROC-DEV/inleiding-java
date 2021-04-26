package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class RekenMachine extends Applet {
    TextField tekstvak;
    TextField geschreven;
    Label label;
    Button gedeelddoor;
    Button keer;
    Button plus;
    Button min;
    String tekstvakcijfer;
    String tekstvakcijfer2;
    double getal1;
    double getal2;
    double antwoord;
    private boolean showText = false;

    public void init() {
        tekstvak = new TextField("", 20);
        geschreven = new TextField("",20);
        label = new Label("Antwoord:");

        gedeelddoor = new Button("/");
        GedeelddoorKnopListener gedeeldoorKnopListener = new GedeelddoorKnopListener();
        gedeelddoor.addActionListener(gedeeldoorKnopListener);

        keer = new Button("*");
        KeerKnopListener keerKnopListener = new KeerKnopListener();
        keer.addActionListener(keerKnopListener);

        plus = new Button("+");
        PlusKnopListener plusKnopListener = new PlusKnopListener();
        plus.addActionListener(plusKnopListener);

        min = new Button("-");
        MinKnopListener minKnopListener = new MinKnopListener();
        min.addActionListener(minKnopListener);

//Zet de knoppen op het scherm
        add(label);
        add(tekstvak);
        add(keer);
        add(plus);
        add(min);
        add(gedeelddoor);
        add(geschreven);
    }

    //Eventhandler voor de ok knop
    class GedeelddoorKnopListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            tekstvakcijfer = tekstvak.getText();
            tekstvakcijfer2 = geschreven.getText();
            getal1 = Double.parseDouble(tekstvakcijfer);
            getal2 = Double.parseDouble(tekstvakcijfer2);
            antwoord = getal1 / getal2;
            tekstvak.setText("" + antwoord);
            geschreven.setText("");
            repaint();
        }
    }

    class KeerKnopListener implements  ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            tekstvakcijfer = tekstvak.getText();
            tekstvakcijfer2 = geschreven.getText();
            getal1 = Double.parseDouble(tekstvakcijfer);
            getal2 = Double.parseDouble(tekstvakcijfer2);
            antwoord = getal1 * getal2;
            tekstvak.setText("" + antwoord);
            geschreven.setText("");
            repaint();
        }
    }

    class PlusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvakcijfer = tekstvak.getText();
            tekstvakcijfer2 = geschreven.getText();
            getal1 = Double.parseDouble(tekstvakcijfer);
            getal2 = Double.parseDouble(tekstvakcijfer2);
            antwoord = getal1 + getal2;
            tekstvak.setText("" + antwoord);
            geschreven.setText("");
            repaint();
        }
    }

    class MinKnopListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvakcijfer = tekstvak.getText();
            tekstvakcijfer2 = geschreven.getText();
            getal1 = Double.parseDouble(tekstvakcijfer);
            getal2 = Double.parseDouble(tekstvakcijfer2);
            antwoord = getal1 - getal2;
            tekstvak.setText("" + antwoord);
            geschreven.setText("");
            repaint();
        }
    }

}