package h12;

import java.awt.*;
import java.applet.*;

public class Knoppen extends Applet {


    public void init() {


        Button[] buttons = new Button[25];
        String[] names = new String[buttons.length];


       for (int teller = 0; teller < buttons.length; teller ++) {


            buttons[teller] = new Button( names[teller] );
            add(buttons[teller]);

       }
    }}


