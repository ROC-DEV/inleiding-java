package h08;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mensen extends Applet {

    int mannen;
    int vrouwen;
    int jongens;
    int meisjes;

    Button mannen1;
    Button vrouwen1;
    Button jongens1;
    Button meisjes1;



public void init() {

    mannen = 0;
    vrouwen = 0;
    jongens = 0;
    meisjes = 0;

    mannen1 = new Button("Mannen");
    vrouwen1 = new Button("Vrouwen");
    jongens1 = new Button("Jongens");
    meisjes1 = new Button ("Meisjes");


    mannen1.addActionListener(new mannenListener() );
    vrouwen1.addActionListener(new vrouwenListener() );
    meisjes1.addActionListener(new meisjesListener() );
    jongens1.addActionListener(new jongensListener() );

    add(mannen1);
    add(vrouwen1);
    add(jongens1);
    add(meisjes1);


}

public void paint (Graphics g) {
    g.drawString("" + mannen, 50, 80);
    g.drawString("" + vrouwen, 150, 80);
    g.drawString("" + jongens, 250, 80);
    g.drawString("" + meisjes, 350, 80);

    g.drawString("Totaal", 485, 55);

    g.drawString("" + (mannen + vrouwen + jongens + meisjes), 500, 80);

    mannen1.setLocation(25, 40);
    vrouwen1.setLocation(125, 40);
    jongens1.setLocation(225, 40);
    meisjes1.setLocation(325, 40);

}

    class mannenListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            mannen = mannen + 1;

            repaint();

        }}

    class vrouwenListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            vrouwen = vrouwen + 1;

            repaint();

        }}

    class jongensListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            jongens = jongens + 1;

            repaint();

        }}

    class meisjesListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            meisjes = meisjes + 1;

            repaint();

        }}}