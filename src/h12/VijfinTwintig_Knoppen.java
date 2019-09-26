package h12;

import java.applet.Applet;
import java.awt.*;

public class VijfinTwintig_Knoppen extends Applet {
    int aantal[];
    Button button;

    public void init() {
        aantal = new int[25];

        for (int teller = 1; teller <= aantal.length; teller++) {
            button = new Button("Button" + teller);
            add(button);
        }
    }
}