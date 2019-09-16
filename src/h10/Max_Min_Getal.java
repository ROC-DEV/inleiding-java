package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Max_Min_Getal extends Applet {

    TextField tekstvak1;
    double tekst2;
    String s;
    String tekst1;

    public void init() {
    tekstvak1 = new TextField("", 20);
    tekstvak1.addActionListener(new MaxGetalListener());
    tekst1 = "";
    add(tekstvak1);
    s = "";
    }

    class MaxGetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//        tekst1 = tekstvak1.getText();
//        tekst2 = Double.parseDouble(tekst1);
//        if (tekst2 > tekst2) {
            repaint();
        }
    }

    public void paint(Graphics g) {

            g.drawString(s,50,50);
            repaint();
        }
    }

