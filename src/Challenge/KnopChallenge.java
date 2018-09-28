package Challenge;


import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KnopChallenge extends Applet {

    double Bestelling;
    double Totaal;

    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button BinnGedist;
    Button BuitGedist;

    Button New;


    public void init() {

        Bestelling = 0.0;
        Totaal = 0.0;


        Fris = new Button("Fris");
        Bier = new Button("Bier");
        Wijn = new Button("Wijn");
        Koffie = new Button("Koffie");
        BinnGedist = new Button("Binn. gedist.");
        BuitGedist = new Button("Buit. gedist.");

        New = new Button("Nieuwe Bestelling");

        Fris.addActionListener(new FrisListener());
        Bier.addActionListener(new BierListener());
        Wijn.addActionListener(new WijnListener());
        Koffie.addActionListener(new KoffieListener());
        BinnGedist.addActionListener(new BinnListener());
        BuitGedist.addActionListener(new BuitListener());

        New.addActionListener(new ResetListener());

        add(Fris);
        add(Bier);
        add(Wijn);
        add(Koffie);
        add(BinnGedist);
        add(BuitGedist);

        add (New);

    }

    public void paint(Graphics g) {
        g.drawString("Bestelling totaal: " + Bestelling, 50, 120);
        g.drawString("Totaal dagomzet: " + Totaal, 50, 140);


        New.setLocation(140, 60);


    }

    class FrisListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = Bestelling + 2.25;
            Totaal = Totaal + 2.25;

            repaint();

        }
    }

    class BierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = Bestelling + 2.50;
            Totaal = Totaal + 2.50;

            repaint();

        }
    }

    class WijnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = Bestelling + 2.50;
            Totaal = Totaal + 2.50;

            repaint();

        }
    }

    class KoffieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = Bestelling + 2;
            Totaal = Totaal + 2;

            repaint();

        }
    }

    class BinnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = Bestelling + 3;
            Totaal = Totaal + 3;

            repaint();

        }
    }

    class BuitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = Bestelling + 3.75;
            Totaal = Totaal + 3.75;

            repaint();

        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Bestelling = 0.0;

            repaint();

        }
    }}
