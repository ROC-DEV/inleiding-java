package h06;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class h6_eindopdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double uitkomst;
    int antwoord;

    public void init(){
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst = (cijfer1 + cijfer2 + cijfer3);
        uitkomst = uitkomst/3;
        uitkomst *= 10.0;
        int antwoord = (int)uitkomst;
        uitkomst = antwoord;
        uitkomst = uitkomst/10;


        setSize(800,800);
    }
    public void paint(Graphics g){


        g.drawString("Het gemiddelde is " + uitkomst,20,20);
    }

}
