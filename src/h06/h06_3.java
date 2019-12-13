package h06;

import javax.swing.*;
import java.awt.*;
import java.applet.Applet;

public class h06_3 extends Applet {

        int a;
        int b;
        int uitkomst;

        public void init(){
            a=2147483647;
            b=1;
            uitkomst= a + b;
            setSize(800,800);
        }

        public void paint(Graphics g){

            g.drawString("het uitkomst is: " + uitkomst, 100,100);
        }





}
