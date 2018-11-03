package h11;

import java.awt.*;

import java.applet.*;

import java.awt.event.*;


public class H11OpdrachtPraktijk extends Applet {
    TextField tekstvak;
    String s, text;
    Button knop;
    int nummer;


    public void init() {

        tekstvak = new TextField("", 20);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(knop);
        add(tekstvak);
        s = "";
    }


    public void paint(Graphics g) {

        int x = 0;
        for (int teller = 1; teller < 11; teller++) {
            x = nummer * teller;
            g.drawString("" + x, 20, 20 + teller * 20);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nummer = Integer.parseInt(tekstvak.getText());
            repaint();

        }
    }
}