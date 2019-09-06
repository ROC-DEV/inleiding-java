package h05;

import java.awt.*;
import javax.swing.*;

public class DrieKinderen2 extends JApplet {

    int nummersX;
    int namenY;
    int breedtebalken;
    int gewichtvalerie;
    int gewichtjeroen;
    int gewichthans;
    int keervalerie;
    int keervalerie2;
    int keervalerie3;
    int balkY;
    int Reken1;
    int Reken2;
    int Reken3;

    int naamXas = 210;
    int naamYas = 245;
    String naam = "Hans";
    int gewicht = 80;
    int xAsStartPositie = naamXas;
    int yas = 210 - gewicht;

    public void init() {
        setBackground(Color.WHITE);

        nummersX = 30;
        namenY = 245;
        breedtebalken = 20;
        gewichtvalerie = 40;
        gewichtjeroen = 100;
        gewichthans = 80;
        keervalerie = 4;
        keervalerie2 = 1/4;
        keervalerie3 = keervalerie + keervalerie2;
        balkY = 210;
        Reken1 = 1/2;
        Reken2 = 1;
        Reken3 = Reken1 + Reken2;
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Chart
        g.setColor(Color.BLACK);
        g.drawRect(0,balkY,400,10);
        g.fillRect(0,balkY,400,10);
        g.drawRect(70,0,10,400);
        g.fillRect(70,0,10,400);

        // Names
        g.setColor(Color.RED);
        g.drawString("Valerie",90,namenY);

        // Numbers
        g.setColor(Color.BLACK);
        g.drawString("200",nummersX,10);
        g.drawString("180",nummersX,30);
        g.drawString("160",nummersX,50);
        g.drawString("140",nummersX,70);
        g.drawString("120",nummersX,90);
        g.drawString("100",nummersX,110);
        g.drawString("80",nummersX,130);
        g.drawString("60",nummersX,150);
        g.drawString("40",nummersX,170);
        g.drawString("20",nummersX,190);
        g.drawString("0",nummersX,210);


        // Balks

        // Valerie
        gewicht = 40;
        yas = 210 - gewicht;

        g.setColor(Color.RED);
        g.fillRect(93,yas,breedtebalken,gewicht);

        //Hans
        gewicht = 80;
        yas = 210 - gewicht;

        g.setColor(Color.BLUE);
        g.drawString(naam,naamXas,naamYas);
        //130 = lengte van balk +-
        g.fillRect(xAsStartPositie,yas,breedtebalken,gewicht);

        //Jeroen
        naamXas = 153;
        naamYas = 245;
        naam = "Jeroen";
        gewicht = 100;
        xAsStartPositie = naamXas;
        yas = 210 - gewicht;

        g.setColor(Color.ORANGE);
        g.drawString(naam,naamXas,naamYas);
        g.fillRect(xAsStartPositie,yas,breedtebalken,gewicht);
    }

}
