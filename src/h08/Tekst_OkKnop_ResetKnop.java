package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekst_OkKnop_ResetKnop extends Applet {
    TextField tekstvak;
    Label label;
    Button okbutton;
    Button resetbutton;
    TextField geschreven;
    private boolean showText = false;

    public void init() {
        tekstvak = new TextField("", 20);
        geschreven = new TextField("",20);
        label = new Label("Type");

        //Maak ok knop en koppel aan een event listener
        okbutton = new Button("Ok");
        OkKnopListener okKnopListener = new OkKnopListener();
        okbutton.addActionListener(okKnopListener);

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
        @Override
        public void actionPerformed(ActionEvent e) {
            String geschrevenText;
            geschrevenText = tekstvak.getText();
            geschreven.setText(geschrevenText);
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