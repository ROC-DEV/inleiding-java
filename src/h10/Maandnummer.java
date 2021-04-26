package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Maandnummer extends Applet {

    TextField maandInput;
    int dag;
    String s,tekst;
    Label label;

    public void init() {
        super.init();
        maandInput = new TextField(20);
        label = new Label("Type hier:");
        maandInput.addActionListener(new TekstvakListener());
        add(label);
        add(maandInput);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(tekst,50,50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = maandInput.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari, heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari, heeft 28 dagen.";
                    break;
                case 3:
                    tekst = "Maart, heeft 31 dagen.";
                    break;
                case 4:
                    tekst = "April, heeft 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei, heeft 31 dagen.";
                    break;
                case 6:
                    tekst = "Juni, heeft 30 dagen.";
                    break;
                case 7:
                    tekst = "Juli, heeft 31 dagen.";
                    break;
                case 8:
                    tekst = "Augustus, heeft 31 dagen.";
                    break;
                case 9:
                    tekst = "September, heeft 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober, heeft 31 dagen.";
                    break;
                case 11:
                    tekst = "Novembur, heeft 30 dagen.";
                    break;
                case 12:
                    tekst = "December, heeft 31 dagen.";
                    break;
                default:
                    tekst = "Er zijn maar 12 maanden in een jaar.";
            }
            maandInput.setText("");
            repaint();
        }
    }
}
