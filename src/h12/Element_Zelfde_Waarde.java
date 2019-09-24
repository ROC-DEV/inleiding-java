package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Element_Zelfde_Waarde extends Applet {
    TextField tekstvak;
    int[] tabel;
    int gezocht;
    int aantal;
    String s,tekst;

    public void init() {
        tekstvak = new TextField(10);
        tekstvak.addActionListener(new TekstvakListener());
        tabel = new int[100];

        for (int teller = 0; teller < tabel.length; teller++) {
            tabel[teller] =(int) (Math.random() * 100);
            System.out.println(""+tabel[teller]);
        }
        tekst = "";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller;
            teller = 0;
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            while (teller < tabel.length) {
                if (tabel[teller] == gezocht) {
                    aantal++;
                }
                teller++;
            }

            if (aantal > 0) {
                tekst = "Het getal "+gezocht+" staat zoveel keer in de array:"+aantal;
            }
            else {
                tekst = "Het getal "+gezocht+" is niet in de array";
            }

            tekstvak.setText("");
            repaint();
            aantal = 0;
        }
    }
}