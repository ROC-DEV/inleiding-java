package h08;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Rekenmachine extends Applet {


    TextField tekstvak1;
TextField tekstvak2;

Button keer;
Button delen;
Button plus;
Button min;

double getalOne;
double getalTwo;

    String one;
    String two;

    String uitkomst;



    public void init() {

        keer = new Button("*");
        delen = new Button("/");
        plus = new Button("+");
        min = new Button("-");

        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);

        keer.addActionListener(new keerListener() );
        delen.addActionListener(new delenListener() );
        plus.addActionListener(new plusListener() );
        min.addActionListener(new minListener() );

        add(tekstvak1);
        add(tekstvak2);

        add(keer);
        add(delen);
        add(plus);
        add(min);


    }

    public void paint(Graphics g){





    }

    class keerListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
        one = tekstvak1.getText();
        getalOne = Double.parseDouble(one);

        two = tekstvak2.getText();
        getalTwo = Double.parseDouble(two);

        uitkomst = String.valueOf(getalOne * getalTwo);
        tekstvak1.setText(uitkomst);
        tekstvak2.setText("");


        }}

    class delenListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            one = tekstvak1.getText();
            getalOne = Double.parseDouble(one);

            two = tekstvak2.getText();
            getalTwo = Double.parseDouble(two);

            uitkomst = String.valueOf(getalOne / getalTwo);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");


        }}


    class plusListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            one = tekstvak1.getText();
            getalOne = Double.parseDouble(one);

            two = tekstvak2.getText();
            getalTwo = Double.parseDouble(two);

            uitkomst = String.valueOf(getalOne + getalTwo);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");


        }}

    class minListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            one = tekstvak1.getText();
            getalOne = Double.parseDouble(one);

            two = tekstvak2.getText();
            getalTwo = Double.parseDouble(two);

            uitkomst = String.valueOf(getalOne - getalTwo);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");


        }}}