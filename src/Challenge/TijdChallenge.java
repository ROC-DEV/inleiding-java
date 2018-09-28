package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class TijdChallenge extends Applet {


    String London;
    String Tokyo;
    String NewYork;
    String Sydney;

    int Lt;
    int Tt;
    int Nt;
    int St;

    int getTime;

    TextField tekstvak;
    Button Toon;



    public void init() {

    tekstvak = new TextField(20);
    Toon = new Button("Toon Tijden");

Toon.addActionListener( new Show());

    add(tekstvak);
    add(Toon);

    }

    public void paint(Graphics g) {

        g.drawString(London, 20, 50);
        g.drawString(Tokyo, 20, 70);
        g.drawString(NewYork, 20, 90);
        g.drawString(Sydney, 20, 110);


    }


    class Show implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            getTime = Integer.parseInt(tekstvak.getText());

            if(getTime <= 23 && getTime > -1) {


                Lt = getTime - 1;
                Tt = getTime + 7;
                Nt = getTime - 6;
                St = getTime + 8;

                if(Lt < 0) {
                    Lt = Lt + 24;
                }

                if(Tt >= 24) {
                   Tt = Tt - 24;
                }

                if(Nt < 0) {
                    Nt = Nt + 24;
                }

                if(St >= 24) {
                    St = St - 24;
                }

                London = "London: " + String.valueOf(Lt) + ":00" ;
                Tokyo = "Tokyo: " + String.valueOf(Tt) + ":00" ;
                NewYork = "New York: " + String.valueOf(Nt) + ":00" ;
                Sydney = "Sydney: " + String.valueOf(St + ":00");


                repaint();
            }

            else {

                London = "Ongeldige invoer";
                Tokyo = "";
                NewYork = "";
                Sydney = "";

                repaint();

            }


            }


        }
    }

