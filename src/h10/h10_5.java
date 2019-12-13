package h10;

import h08.h8_1;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class h10_5 extends Applet {
    Button okknop;
    Double cijfer;
    Double totaal;



    TextField tekstvak;
    int aantal;

    String uitslag;
    String geslaagdofnietgeslaagd;
    boolean geklikt;

    public void init() {
        cijfer = 0.0;
        uitslag = "";

        tekstvak = new TextField(10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okknop = new Button("ok");
        okknop.addActionListener(new okknopListener());
        add(okknop);

        geslaagdofnietgeslaagd= "";
        geklikt= false;
        setSize(400,400);

    }


    public void paint(Graphics g) {
        g.drawString("getal " + cijfer + " is " + uitslag, 50,60);
        if (geklikt== true);
        g.drawString("gemmidelde cijfer= " + (totaal/aantal),50,80);
        g.drawString("student is " + geslaagdofnietgeslaagd,50,100);


    }

    public class okknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt= true;
            double gemiddelde= totaal / aantal;
            if (gemiddelde< 5.5){
                geslaagdofnietgeslaagd= "niet geslaagd";
            }else {
                geslaagdofnietgeslaagd= "geslaagd";
            }
            totaal= aantal+ cijfer;
            aantal++;

            repaint();

        }
    }


    public class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt= false;
            cijfer= Double.parseDouble(tekstvak.getText());
            if (cijfer < 5.5){
                uitslag= "onvoldoende ";
            }else {
                uitslag= "voldoende ";
            }


            repaint();


        }


    }
}
