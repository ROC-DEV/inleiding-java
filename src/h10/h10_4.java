package h10;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class h10_4 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label1;
    Label label2;
    String s,tekst, tekst2;
    int jaartal;
    int maand;

    public void init(){
        tekstvak1= new TextField("",10);
        tekstvak1.addActionListener(new tekstvakListener());
        add(tekstvak1);
        label1= new Label("maand");
        add(label1);
        tekstvak2= new TextField("",10);
        tekstvak2.addActionListener(new tekstvakListener());
        add(tekstvak2);
        label2= new Label("jaar");
        add(label2);

        setSize(400,400);
    }

    public void paint(Graphics g){
        g.drawString(tekst,50,60);
        g.drawString(tekst2,50,80);
    }


    public class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s= tekstvak1.getText();
            String userInputString = tekstvak1.getText();
            maand= Integer.parseInt(userInputString);

            s= tekstvak2.getText();
            String userInputString2 = tekstvak2.getText();
            jaartal= Integer.parseInt(userInputString2);

            s = tekstvak2.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)))
            {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();

            switch (maand){

                case 1:
                    tekst = " januari heeft 31 dagen";
                    break;

                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0))) {
                        tekst = "februari heeft 29 dagen";
                    }else {
                        tekst = "februari heeft 28 dagen";
                    }
                    break;

                case 3:
                    tekst = "maart heeft 31 dagen";
                    break;

                case 4:
                    tekst = "april heeft 30 dagen";
                    break;

                case 5:
                    tekst = "mei heeft 31 dagen";
                    break;

                case 6:
                    tekst = "juni heeft 30 dagen";
                    break;

                case 7:
                    tekst = "juli heeft 31 dagen";
                    break;

                case 8:
                    tekst = "augustus heeft 30 dagen";
                    break;

                case 9:
                    tekst = "september heeft 31 dagen";
                    break;

                case 10:
                    tekst = "oktober heeft 30 dagen";
                    break;

                case 11:
                    tekst = "november heeft 31 dagen";
                    break;

                case 12:
                    tekst= "december heeft 30 dagen";
                    break;

                default:
                    tekst="deze maand bestaat niet";
                    break;
            }
            repaint();


        }
    }
}
