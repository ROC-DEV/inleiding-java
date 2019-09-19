import javax.swing.*;
import java.awt.*;
import java.applet.*;


public class Stoplicht extends Applet {


    public void init() {

        setSize(600, 600);
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {


        g.fillRoundRect(50, 70, 70, 170, 25, 60);
        g.setColor(Color.RED);
        g.fillOval(65, 85, 40, 40);
        g.setColor(Color.ORANGE);
        g.fillOval(65, 135, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(65, 185, 40, 40);

    }
}

