package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class DiagramChallenge extends Applet {

    Button Toon;

    TextField Valerie;
    TextField Hans;
    TextField Jeroen;

    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;


    public void init() {

        Toon = new Button("Toon");

        Valerie = new TextField("40", 10);
        Hans = new TextField("80", 10);
        Jeroen = new TextField("100", 10);


        gewichtValerie = 40;
        gewichtHans = 80;
        gewichtJeroen = 100;

        Toon.addActionListener( new knopListener() );



        add(Toon);
        add(Valerie);
        add(Hans);
        add(Jeroen);


    }


    public void paint(Graphics g) {
        setBackground(Color.white);


        g.drawString("Valerie", 240, 780);
        g.drawString("Hans", 370, 780);
        g.drawString("Jeroen", 500, 780);

        g.drawString("Valerie", 380, 50);
        g.drawString("Hans", 490, 50);
        g.drawString("Jeroen", 580, 50);


        g.fillRect(210, 750, 380, 5);
        g.fillRect(210, 105, 5, 650);


        g.drawString("0", 180, 740);
        g.drawString("20", 180, 640);
        g.drawString("40", 180, 540);
        g.drawString("60", 180, 440);
        g.drawString("80", 180, 340);
        g.drawString("100", 180, 240);
        g.drawString("120", 180, 140);



        g.setColor(Color.red);
        g.fillRect(230, 740 - gewichtValerie * 5, 80, gewichtValerie * 5); //40 //y=400

        g.fillRect(360, 740 - gewichtHans * 5, 80, gewichtHans * 5); //80

        g.fillRect(490, 740 - gewichtJeroen * 5, 80, gewichtJeroen * 5); //100

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gewichtValerie = Integer.parseInt(Valerie.getText());
            gewichtHans = Integer.parseInt(Hans.getText());
            gewichtJeroen = Integer.parseInt(Jeroen.getText());

            repaint();
        }
    }

}