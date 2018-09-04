package h06;

import java.awt.*;
import java.applet.*;

public class Verdeling extends Applet {

    int verdiend;
    int verdeling;

// DIT IS OPDRACHT 6.1

    public void init() {


        verdiend = 133;

        verdeling = verdiend / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: € " + verdeling, 20, 40);
        g.drawString("Ali: € " + verdeling, 20, 60);
        g.drawString("Jeanette: € " + verdeling, 20, 80);
        g.drawString("Kaj: € " + verdeling, 20, 100);


    }}