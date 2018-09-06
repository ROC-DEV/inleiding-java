package h07;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {


    int dim;


    public void init() {

        Dimension dim = new Dimension(500,500);

        this.setBackground(Color.red);
        this.setSize(dim);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}