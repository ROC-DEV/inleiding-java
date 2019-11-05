package h11;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class h11_7 extends Applet {

    public void init(){
        setSize(600,600);

    }

    public void paint(Graphics g){
        int y=400;
        int x=400;
        int breedte=5;
        int hoogte=5;
        int teller=0;

        while (teller<50){

            x-=10;
            y-=10;

            breedte+=5;
            hoogte+=5;
            teller++;

            g.drawOval(breedte,hoogte,x,y);

        }

    }
}
