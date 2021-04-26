package h06;

import java.applet.Applet;
import java.awt.*;
public class NegatiefGetal extends Applet {

    private int _getal01;
    private int _getal02;


    public void init() {
        _getal01 = 2147483647;
        _getal02 = 1073780000;
    }

    private int _getal03 = _getal01 + _getal02;

    public void paint(Graphics g) {
        System.out.print(_getal03);
        g.drawString(Integer.toString(_getal03),50,50);
    }
}
