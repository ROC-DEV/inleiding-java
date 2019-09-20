package h12;

import java.applet.Applet;
import java.awt.*;

public class VijfinTwintig_Knoppen extends Applet {
    int aantal[];
    Button button;
    int teller;

    public void init() {
        aantal = new int[25];

        int y = 10;

        for (teller = 1; teller <= aantal.length; teller++) {
            button = new Button("Button" + teller);
            add(button);
        }
    }
}