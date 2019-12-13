package h06;

import javax.swing.*;
import java.awt.*;
import java.applet.*;


public class h06_2 extends Applet {

    int minuut;
    int uur;
    int dag;
    int jaar;


    public void init(){
        setSize(800,800);
        minuut=60;
        uur=minuut*60;
        dag=uur*24;
        jaar=dag*365;





    }

    public void paint(Graphics g){

        g.drawString("in een uur zitten " + uur + " seconden",60,120);
        g.drawString("in een dag zitten "+ dag + " seconden",60,150);
        g.drawString("in een jaar zitten " + jaar + " seconden", 60, 180);

    }
}

