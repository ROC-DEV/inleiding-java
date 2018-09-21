package h10;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cijfers extends Applet {

    Button Ok;
    Button reset;
    String slaag;

    String getal1;
    float getal;

    float gemiddelde;
    int deler;
    float uitkomst;

    TextField cijfer;

    String geslaagd;

    public void init() {

        geslaagd = "";


        reset = new Button();
        reset.setLabel("Reset");
        resetListener r = new resetListener();

        reset.addActionListener(r);

        deler = 0;

        cijfer = new TextField("", 30);

        add(cijfer);

        add(reset);
        slaag = "";
        gemiddelde = 0;

        tekstvakListener c = new tekstvakListener();
        cijfer.addActionListener(c);


    }

    public void paint(Graphics g) {

        g.drawString("Het gemiddelde is: " + uitkomst, 20, 90);
        g.drawString(geslaagd, 20, 110);
        g.drawString("Getallen ingevoerd: " + deler, 20, 70);
        g.drawString(slaag,50,50);

        g.setColor(Color.red);
        g.drawString("Vul je cijfer in en druk op enter", 20, 140);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            deler = deler + 1;

            getal1 = cijfer.getText();
            getal = Float.parseFloat(getal1);

            gemiddelde = getal + gemiddelde;
            uitkomst = gemiddelde / deler;



            if (uitkomst > 5.45) {
                geslaagd = "Je bent geslaagd!";
            } else {
                geslaagd = "Je bent gezakt";
            }

            uitkomst = ((int)(uitkomst * 10)) / 10F;

            if (getal < 5.5){
                slaag = "Onvoldoende";
            }
            else if (getal > 5.5){
                slaag = "Voldoende";
            }
            repaint();

        }
    }



    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

uitkomst = 0;
gemiddelde = 0;
deler = 0;
geslaagd = "";
cijfer.setText("");
slaag = "";
repaint();


        }
    }

}



