import javax.swing.*;
import java.awt.*;
import java.applet.*;


public class Ellips extends Applet {


    public void init() {

        setSize(600, 600);
        setBackground(Color.blue);

    }
    public void paint (Graphics g){


        g.setColor(Color.YELLOW);
        g.drawArc(20, 20, 100, 50, 360, 360);
        g.fillArc(20,20,100,50,90,45);
    }

}
