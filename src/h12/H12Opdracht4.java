package h12;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class H12Opdracht4 extends Applet {
    boolean gevonden;
    TextField tekstvak;
    Button knop;
    int[] salaris = {0, 100, 200, 300, 400, 500};
    int hoogte;
    String T;
    String F;



    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());

        add(tekstvak);
        add(knop);
    }


    public void paint(Graphics g) {


        int teller = 0;
        while (teller < salaris.length) {
            g.drawString("" + salaris[teller], 50, hoogte);
            teller++;
            hoogte += 20;
        }


        g.drawString("" + T ,120, 120);
        g.drawString("" + F, 120, 120);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (gevonden == true) {
             T = ("De waarde is gevonden.");

            } else {
                F = ("De waarde is niet gevonden");
            }

repaint();
        }

    }
}












