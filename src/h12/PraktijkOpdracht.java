package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PraktijkOpdracht extends Applet {
    Label name;
    Label number;
    TextField nameinput;
    TextField numberinput;
    Button okknop;
    Button resetknop;
    int teller;
    String sname, snumber;
    String[] namen;
    boolean enoughnumbers;

    public void init() {
        setSize(800,400);
        enoughnumbers = false;

        name = new Label("Name Person");
        number = new Label("Cellphonenumber Person");

        nameinput = new TextField(15);
        numberinput = new TextField("",15);

        nameinput.addActionListener(new OkKnopListener());
        numberinput.addActionListener(new OkKnopListener());

        okknop = new Button("Ok");
        okknop.addActionListener(new OkKnopListener());
        resetknop = new Button("Reset");
        resetknop.addActionListener(new ResetKnopListener());

        namen = new String[10];

        add(name);
        add(nameinput);
        add(number);
        add(numberinput);
        add(okknop);
        add(resetknop);
        Arrays.fill(namen, "");
    }

    public void paint(Graphics g) {
        int y = 50;
        for (String namen : namen) {
            g.drawString(namen, 60, y+=15);
        }
    }

    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sname = nameinput.getText().toLowerCase();
            snumber = numberinput.getText();
            if (teller < namen.length) {
                namen[teller]="Name: " + sname + "    Cellphone Number: " + snumber;
                teller++;
                System.out.println("Numbers added "+ teller);
                if (teller == namen.length) {
                    enoughnumbers = true;
                }
            }

            if (enoughnumbers) {
                Arrays.sort(namen);
                repaint();
            }
            nameinput.setText("");
            numberinput.setText("");
        }
    }

    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Arrays.fill(namen,"");
            teller = 0;
            enoughnumbers = false;
            repaint();
        }
    }
}