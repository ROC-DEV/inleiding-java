package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jaarnummer extends Applet {

    TextField tekstvak;
    Label label;
    Label label2;
    String s, tekst;

    int dag;

    TextField jaarvak;
    int jaartal;
    int dagen;
String q;


        public void init() {
            label2 = new Label("Typ het jaartal en druk op enter");
            jaarvak = new TextField("", 22);
            label = new Label("Typ het maandnummer en druk op enter");
            tekstvak = new TextField("", 15);
            tekstvak.addActionListener( new TekstvakListener() );
            tekst = "";

            dagen = 28;

            jaarvak.addActionListener(new JaarListener() );

            add(label2);
           add (jaarvak);
            add(label);
            add(tekstvak);
        }

        public void paint(Graphics g) {
            g.drawString(tekst, 50, 110 );
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                dag = Integer.parseInt(s);
                switch (dag) {
                    case 1:
                        tekst = "Januari, 31 dagen";
                        break;
                    case 2:
                        tekst = "Februari, " + dagen + " dagen";
                        break;
                    case 3:
                        tekst = "Maart, 31 dagen";
                        break;
                    case 4:
                        tekst = "April, 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei, 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni, 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli, 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus, 31 dagen";
                        break;
                    case 9:
                        tekst = "September, 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober, 31 dagen";
                        break;
                    case 11:
                        tekst = "November, 30 dagen";
                        break;
                    case 12:
                        tekst = "December, 31 dagen";
                        break;
                    default:
                        tekst = "Onjuist nummer ingevoerd";
                        break;
                }
                repaint();
            }}

            class JaarListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    tekst = "";
                q = jaarvak.getText();
                jaartal = Integer.parseInt(q);
            if((jaartal %4==0&&!(jaartal %100==0))||
                jaartal %400==0)

                {
                    dagen = 29;
                    repaint();
                }
            else

                {
                    dagen = 28;
                    repaint();
                }

                repaint();
            }}}
