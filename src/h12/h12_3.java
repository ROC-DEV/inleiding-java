package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class h12_3 extends Applet {
    TextField[] tekstvak;
    Button knop;
    double[] invoer;

    public void init() {
        tekstvak = new TextField[5];
        invoer = new double[5];
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
            add(knop);
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            for (int i = 0; i < tekstvak.length; i++) {
                invoer[i] = Double.parseDouble(tekstvak[i].getText());
            }
            Arrays.sort(invoer);
            for (int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText(String.valueOf(invoer[i]));
            }
            repaint();
        }
    }
}