package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MaandNummerJaar extends Applet {
    TextField tekstvak;
    TextField jaartekstvak;
    Label label;
    Label jaren;
    String s, tekst, tekst2;
    int dag;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 12);
        jaartekstvak = new TextField("", 12);
        label = new Label("Type uw Maandnummer in");
        jaren = new Label("Type hier uw Jaar in            ");
        tekstvak.addActionListener(new TekstvakListener());
        jaartekstvak.addActionListener(new JaarListener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add(jaren);
        add(jaartekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80);
        g.drawString(tekst2, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari, deze maand heeft 31 Dagen.";
                    break;
                case 2:
                    tekst = "Februari, deze maand heeft 28 Dagen.";
                    break;
                case 3:
                    tekst = "Maart, deze maand heeft 31 Dagen.";
                    break;
                case 4:
                    tekst = "April, deze maand heeft 30 Dagen.";
                    break;
                case 5:
                    tekst = "Mei, deze maand heeft 31 Dagen.";
                    break;
                case 6:
                    tekst = "Juni, deze maand heeft 30 Dagen.";
                    break;
                case 7:
                    tekst = "Juli, deze maand heeft 31 Dagen.";
                    break;
                case 8:
                    tekst = "Augustus, deze maand heeft 31 Dagen.";
                    break;
                case 9:
                    tekst = "September, deze maand heeft 30 Dagen.";
                    break;
                case 10:
                    tekst = "Oktober, deze maand heeft 31 Dagen.";
                    break;
                case 11:
                    tekst = "November, deze maand heeft 30 Dagen.";
                    break;
                case 12:
                    tekst = "December, deze maand heeft 31 Dagen.";
                    break;
                default:
                    tekst = "Er zijn maar 12 Maanden in een jaar!";
                    break;
            }
            tekstvak.setText("");
            repaint();
        }
    }

    class JaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = jaartekstvak.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
                jaartekstvak.setText("");
            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
                jaartekstvak.setText("");
            }
            repaint();

        }
    }
}