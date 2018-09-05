package h06;

import java.awt.*;
import java.applet.*;

public class Tijd extends Applet {


    int seconden;
    int uur;
    int dag;
    int jaar;


        public void init() {

            seconden = 60;
            uur = 60;
            dag = 24;
            jaar = 365;

        }

            public void paint(Graphics g) {

                g.drawString("Seconden in een uur: " + seconden * uur, 20, 20);
                g.drawString("Seconden in een dag: " + seconden * uur * dag, 20, 40);
                g.drawString("Seconden in een jaar: " + seconden * uur * dag * jaar, 20, 60);





            }}