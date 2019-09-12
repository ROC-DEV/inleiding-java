package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class EnterBtw extends Applet {
    TextField tekstvak;
    Label label;
    Button okbutton;
    Button resetbutton;
    TextField geschreven;
    private boolean showText = false;

    public void init() {
        tekstvak = new TextField("", 15);
        geschreven = new TextField("",15);
        label = new Label("Type hier ->");

        //Maak ok knop en koppel aan een event listener
        okbutton = new Button("Rente");
        OkKnopListener okKnopListener = new OkKnopListener();
        okbutton.addActionListener(okKnopListener);
        tekstvak.addActionListener(okKnopListener);

        resetbutton = new Button("Reset");
        ResetKnopListener resetKnopListener = new ResetKnopListener();
        resetbutton.addActionListener(resetKnopListener);

//Zet de knoppen op het scherm
        add(label);
        add(tekstvak);
        add(okbutton);
        add(resetbutton);
        add(geschreven);
    }

    //Eventhandler voor de ok knop
    class OkKnopListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            double getal =  1;
            double getal2 = getal *1.21;
            String s = tekstvak.getText();
            getal2 = Double.parseDouble( s );
            String geschrevenText;
            geschrevenText = "";
            geschreven.setText(geschrevenText + getal2 * 1.21);
        }
    }

    class ResetKnopListener implements  ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            geschreven.setText("");
        }
    }



}