package h08;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class RekenMachine extends Applet {
    TextField tekstvak;
    Label label;
    Button gedeelddoor;
    Button keer;
    Button plus;
    Button min;
    TextField geschreven;
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
        @Override
        public void actionPerformed(ActionEvent e) {
            String geschrevenText;
            geschrevenText = tekstvak.getText();
            geschreven.setText(geschrevenText);
        }
    }

    class KeerKnopListener implements  ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            geschreven.setText("");
        }
    }

    class PlusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class MinKnopListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

}