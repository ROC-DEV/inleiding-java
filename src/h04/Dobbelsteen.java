
import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet{

    public void init() {


    }

    public void paint(Graphics g){

        g.drawRect(150,150,70,70);
        g.fillOval(200,200,15,15);
        g.setColor(Color.black);
        g.fillOval(160,160,15,15);
        g.setColor(Color.black);
        g.fillOval(160,200,15,15);
        g.setColor(Color.black);
        g.fillOval(200,160,15,15);
        g.setColor(Color.black);
    }
}