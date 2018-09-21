package h10;

import java.awt .*;
import java.applet .*;
import java.awt.event .*;

public class PraktijkopdrachtH10 extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int getal;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ het cijfer in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            switch(getal) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "Onjuist getal ingetypt";
                    break;
            }
            repaint();
        }
    }
}
