package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    Label label;
    TextField tekstvak;
    String s;
    String tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField(15);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Vul hier je cijfer in.");

        add(label);
        add(tekstvak);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(tekst,200,50);
    }

    class TekstvakListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        s = tekstvak.getText();
        cijfer = Integer.parseInt(s);
        switch (cijfer) {
            case 1:
                tekst = "Je hebt een slecht.";
                break;
            case 2:
                tekst = "Je hebt een slecht.";
                break;
            case 3:
                tekst = "Je hebt een slecht.";
                break;
            case 4:
                tekst = "Je hebt een onvoldoende.";
                break;
            case 5:
                tekst = "Je hebt een matig.";
                break;
            case 6:
                tekst = "Je hebt een voldoende.";
                break;
            case 7:
                tekst = "Je hebt een voldoende.";
                break;

            case 8:
                tekst = "Je hebt een goed.";
                break;

            case 9:
                tekst = "Je hebt een goed.";
                break;

            case 10:
                tekst = "Je hebt een goed.";
                break;

            default:
                tekst = "U hebt een verkeerd nummer ingetikt ..!";
                break;
        }
        repaint();
    }
}
}