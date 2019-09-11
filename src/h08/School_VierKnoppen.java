package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class School_VierKnoppen extends Applet {
//    TextField tekstvak;
    TextField tekstvak;
    Button man;
    Button vrouw;
    Button jongen;
    Button meisje;
    Button alles;
    int mangetal = 15;
    int vrouwgetal = 10;
    int jongengetal = 5;
    int meisjegetal = 1;
    int allesgetal = mangetal + vrouwgetal + jongengetal + meisjegetal;

    public void init() {

        man = new Button("Man");
        vrouw = new Button("Vrouw");
        jongen = new Button("Jongen");
        meisje = new Button("Meisje");
        alles = new Button("Alles");

        tekstvak = new TextField("", 20);

        ManListener manlistener = new ManListener();
        man.addActionListener(manlistener);

        VrouwListener vrouwlistener = new VrouwListener();
        vrouw.addActionListener(vrouwlistener);

        JongenListener jongenlistener = new JongenListener();
        jongen.addActionListener(jongenlistener);

        MeisjeListener meisjelistener = new MeisjeListener();
        meisje.addActionListener(meisjelistener);

        AllesListener alleslistener = new AllesListener();
        alles.addActionListener(alleslistener);

        add(man);
        add(vrouw);
        add(jongen);
        add(meisje);
        add(alles);
        add(tekstvak);
        repaint();
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man.equals(mangetal);
            System.out.print("" + mangetal);
            repaint();
        }
    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw.equals(vrouwgetal);
            System.out.print("" + vrouwgetal);
            repaint();
        }
    }

    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje.equals(meisjegetal);
            System.out.print("" + meisjegetal);
            repaint();
        }
    }

    class JongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen.equals(jongengetal);
            System.out.print("" + jongengetal);
            repaint();
        }
    }

    class AllesListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            alles.equals(allesgetal);
            System.out.print("" + allesgetal);
            repaint();
        }

        public void paint(Graphics g) {
            g.drawString("" + allesgetal, 50,50);
        }
    }
}
