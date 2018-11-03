package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {
    Label label;
    TextField tekstvak;
    Button knop;
    short tijdL;
    short tijdT;
    short tijdN;
    short tijdS;
    short invoer;

    String s;



    public void init() {
        label = new Label("Voer een uur in");
        tekstvak = new TextField("", 5);
        knop = new Button("Toon Tijden");
        //knop.addActionListener(new VakListener());
        tekstvak.addActionListener(new VakListener());



        tijdL = 0;
        tijdT = 0;
        tijdN = 0;
        tijdS = 0;
        invoer = 0;

        add(label);
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        this.label.setLocation(50,5);
        this.tekstvak.setLocation(148,6);
        this.knop.setLocation(220,6);


        g.drawString("Tijd in London :" + tijdL, 50, 50 );
        g.drawString("Tijd in Tokyo :" + tijdT, 50, 70 );
        g.drawString("Tijd in New York :" + tijdN , 50, 90 );
        g.drawString("Tijd in Sydney :" + tijdS, 50, 110 );








}

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            invoer = Short.parseShort(s);


            //invoer += tijd - 2;
//            tijdL = invoer -1.00;
//            tijdT = invoer  +7;
//            tijdN = invoer -6;
//            tijdS = invoer +9;


repaint();
        }
    }


}
