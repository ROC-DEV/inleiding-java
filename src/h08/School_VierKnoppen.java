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
    int mangetal;
    int vrouwgetal;
    int jongengetal;
    int meisjegetal;
    int allesgetal;

    public void init() {

        man = new Button("Man");
        vrouw = new Button("Vrouw");
        jongen = new Button("Jongen");
        meisje = new Button("Meisje");

        tekstvak = new TextField("", 20);

        ManListener manlistener = new ManListener();
        man.addActionListener(manlistener);

        VrouwListener vrouwlistener = new VrouwListener();
        vrouw.addActionListener(vrouwlistener);

        JongenListener jongenlistener = new JongenListener();
        jongen.addActionListener(jongenlistener);

        MeisjeListener meisjelistener = new MeisjeListener();
        meisje.addActionListener(meisjelistener);

        add(man);
        add(vrouw);
        add(jongen);
        add(meisje);
        add(tekstvak);
        repaint();
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man.equals(mangetal);
            mangetal +=1;
            allesgetal += 1;
            System.out.print("" + mangetal);
            repaint();
        }
    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw.equals(vrouwgetal);
            vrouwgetal+=1;
            allesgetal+=1;
            System.out.print("" + vrouwgetal);
            repaint();
        }
    }

    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje.equals(meisjegetal);
            meisjegetal+=1;
            allesgetal+=1;
            System.out.print("" + meisjegetal);
            repaint();
        }
    }

    class JongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen.equals(jongengetal);
            jongengetal+=1;
            allesgetal+=1;
            System.out.print("" + jongengetal);
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Mannen:" + mangetal, 50,50);
        g.drawString("Potentiele mannelijke leerlingen:" + jongengetal, 50,70);
        g.drawString("Vrouwen:" + vrouwgetal, 50,90);
        g.drawString("Potentiele vrouwelijke leerlingen:" + meisjegetal, 50,110);
        g.drawString("Iedereen:" + allesgetal,50,130);
    }
}
