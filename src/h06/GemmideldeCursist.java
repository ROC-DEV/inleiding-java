package h06;

import javax.swing.*;
import java.awt.*;
public class GemmideldeCursist extends JApplet {

    double getal01 = 5.9;
    double getal02 = 6.3;
    double getal03 = 6.9;
    double gemmidelde01 = (getal01 + getal02 + getal03) / 3;
    double gemmidelde02 = gemmidelde01 * 10;
    int gemmidelde = (int)gemmidelde02;
    double gemmidelde03 = (double)gemmidelde;
    double gemmidelde04 = gemmidelde03 / 10;

    public void init() {
        System.out.printf("" + gemmidelde04);
        System.out.printf("" + gemmidelde);

    }

    public void paint(Graphics g) {
        g.drawString("" +gemmidelde04,30,30);
    }
}
