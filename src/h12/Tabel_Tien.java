package h12;

import java.applet.Applet;
import java.awt.*;

public class Tabel_Tien extends Applet {

    int[] getallen = new int[10];
    double totaal;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 50;

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 10 + 1);
            System.out.print(getallen[i] + "-");
            totaal = totaal + getallen[i];
        }

        totaal /= getallen.length;
        totaal *= 10;
        totaal = (int)totaal;
        totaal /= 10;
        g.drawString("Gemmidelde:" + totaal,50,95);
        for (int i = 0; i < getallen.length; i++) {
            g.drawString(getallen[i] + "", x,70);
            x += 20;
        }

        int x2 = 45;
        int y2 = 55;

        for (int teller = 0; teller < 10; teller++) {
            g.drawRect(x2,y2,20,20);
            x2 += 20;
        }


    }

}
