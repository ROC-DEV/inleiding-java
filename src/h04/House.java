package h04;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class House extends Applet {

    public void init(){

    }

    public void paint (Graphics g) {


        g.drawRect(300, 300, 140, 140);
        g.drawLine(300, 300, 370, 200);
        g.drawLine(370, 200, 440, 300);
        g.drawRect(310, 390, 25, 50);
        g.drawRect(320, 330, 70,35);

}}
