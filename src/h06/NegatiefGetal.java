
package h06;

        import java.awt.*;
        import java.applet.*;

public class NegatiefGetal extends Applet {


    int waarde;
int totaal;
int getal;

    public void init() {

        getal = 200;
        waarde = 2147483647;
        totaal = waarde + getal;

    }

    public void paint(Graphics g) {

        g.drawString("Negatief getal: " + totaal, 20, 40);

    }}