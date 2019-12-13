package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class h8_2 extends Applet {
    Button Jongensknop;
    Button Meisjeknop;
    Button Mannenknop;
    Button Vrouwenknop;

    Button Resetknop;

    int Jongens;
    int Meiden;
    int Mannen;
    int Vrouwen;
    int totaal;

    public void init(){

        Jongensknop= new Button("Jongens");
        Jongensknop.setLabel("Jongen");
        Jongensknop.addActionListener(new JongenknopListener());
        add(Jongensknop);

        Meisjeknop= new Button("Meiden");
        Meisjeknop.setLabel("Meiden");
        Meisjeknop.addActionListener(new MeidenknopListener());
        add(Meisjeknop);

        Mannenknop= new Button("Mannen");
        Mannenknop.setLabel("Mannen");
        Mannenknop.addActionListener(new MannenknopListener());
        add(Mannenknop);

        Vrouwenknop= new Button("Vrouwen");
        Vrouwenknop.setLabel("Vrouwen");
        Vrouwenknop.addActionListener(new VrouwenknopListener());
        add(Vrouwenknop);

        Resetknop = new Button("Reset");
        Resetknop.addActionListener(new ResetknopListener());
        add(Resetknop);


        Jongens= 0;
        Meiden= 0;
        Mannen= 0;
        Vrouwen= 0;
        totaal= 0;
        setSize(500,500);


    }

    public void paint(Graphics g){

        g.drawRect(50,50,300,250);
        g.drawLine(50,100, 350,100);
        g.drawLine(50,150,350,150);
        g.drawLine(50,200,350,200);
        g.drawLine(50,250,350,250);
        g.drawLine(50,300,350,300);
        g.drawLine(200,50,200,300);

        g.drawString("AantalJongens " + Jongens, 60,90);
        g.drawString("AantalMeiden " + Meiden,60,145);
        g.drawString("AantalMannen " + Mannen,60,195);
        g.drawString("AantalVrouwen" + Vrouwen,60,245);
        g.drawString("TotaalAantal" + totaal,60,295);

    }



    public class JongenknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Jongens++;
            totaal= Jongens+ Meiden + Mannen + Vrouwen;
            repaint();
        }
    }

    public class MeidenknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Meiden++;
            totaal= Jongens+ Meiden + Mannen + Vrouwen;
            repaint();
        }
    }

    public class MannenknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Mannen++;
            totaal= Jongens+ Meiden + Mannen + Vrouwen;
            repaint();

        }
    }

    public class VrouwenknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Vrouwen++;
            totaal= Jongens+ Meiden + Mannen + Vrouwen;
            repaint();

        }
    }
    public class ResetknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Jongens= 0;
            Meiden= 0;
            Mannen= 0;
            Vrouwen= 0;
            totaal= Jongens+ Meiden + Mannen + Vrouwen;
            repaint();

        }
    }
}
