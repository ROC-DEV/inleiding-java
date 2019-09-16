package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Maandnummer extends Applet {

    TextField maandInput;
    int aantalMaanden;


    public void init() {
        super.init();

        add(maandInput);
        repaint();
    }

}
