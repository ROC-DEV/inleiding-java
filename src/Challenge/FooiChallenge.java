package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class FooiChallenge extends Applet {

    Button bereken;

    Button plus;
    Button min;

    TextField tekstvak;
    float FooiBedrag;
    float Totaal;

    String vakgetal;
    float vakgetal2;


    int FooiPercentage;
int Fooipercentage2;

public void init() {

    bereken = new Button("Bereken");
    tekstvak = new TextField(20);

    plus = new Button("+");
    min = new Button("-");

    add(plus);
    add(min);

    add(tekstvak);
    add(bereken);

    bereken.addActionListener(new BerekenListener());
    plus.addActionListener(new PlusListener());
    min.addActionListener(new MinListener());





}

public void paint(Graphics g) {

    plus.setLocation(160, 55);
    min.setLocation(185, 55);

    bereken.setLocation(20, 80);
    tekstvak.setLocation(120, 10);


    g.drawString("Rekening bedrag", 20, 25);
    g.drawString("€", 290, 25);



    g.drawString("Percentage fooi:", 20, 70);
    g.drawString("" + FooiPercentage + "%", 130, 70);


    g.drawString("Fooi: " + FooiBedrag + " €", 20, 130);
    g.drawString("Totaal inc. fooi (" + Fooipercentage2 + "%):" + " " + Totaal + " €", 20, 150);

}

    class BerekenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

          vakgetal = tekstvak.getText();
          vakgetal2 = Float.parseFloat(vakgetal);

          FooiBedrag = vakgetal2 / 100 * FooiPercentage;
            FooiBedrag = ((int)(FooiBedrag * 100)) / 100F;

            Totaal = vakgetal2 + FooiBedrag;
            Totaal = ((int)(Totaal * 100)) / 100F;



            Fooipercentage2 = FooiPercentage;



            repaint();

        }
    }

    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            FooiPercentage = FooiPercentage + 1;

            repaint(FooiPercentage);

        }
    }

    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            FooiPercentage = FooiPercentage - 1;

            repaint(FooiPercentage);

        }
    }



}