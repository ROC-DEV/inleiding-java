
import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class h06_1 extends Applet {
    int Bedrag;
    int Jan;
    int Ali;
    int Jeannette;
    int Mehran;
    double uitkomst;

    public void init(){
        setSize(800,800);
        Bedrag=4;
        Jan=113;
        Ali=113;
        Jeannette=113;
        Mehran=113;
        uitkomst=(Jan/Bedrag);

    }
    public void paint(Graphics g){
        g.drawString("Jan"+uitkomst, 300,120);
        g.drawString("ALi"+uitkomst, 300,150);
        g.drawString("Jeannette"+uitkomst,300,180);
        g.drawString("Mehran"+uitkomst,300,210);
    }
}
