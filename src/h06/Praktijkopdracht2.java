package h06;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht2 extends Applet {


    double cijfer1, cijfer2, cijfer3;
    double gemiddelde;
    int hulp;
    double uitkomst;

    public void init() {

    cijfer1 = 5.9;
    cijfer2 = 6.3;
    cijfer3 = 6.9;
    gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
    hulp = (int) (gemiddelde * 10);
    uitkomst = hulp;



    }

    public void paint(Graphics g) {

        g.drawString("Het gemiddelde is: " + (uitkomst / 10), 20, 40);


    }}