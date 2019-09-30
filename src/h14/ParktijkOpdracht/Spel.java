package h14.ParktijkOpdracht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Spel extends Applet {
    private int _knopen = 23;
    private String response;
    private TextField tekstvak;
    private Button pak;
    private Label label;

    public void init() {
        tekstvak = new TextField("",20);
        pak = new Button("Pak");
        label = new Label("Vul 1,2 of 3 in.");

        pak.addActionListener(new PakEvent());

        add(label);
        add(tekstvak);
        add(pak);
        repaint();
    }

    public void paint(Graphics g) {
    g.drawString("" + _knopen,50,50);
    g.drawString(response,50,70);
    }

    class PakEvent implements ActionListener {

        // Hier verwijderd de computer zijn stenen
        public void ComputerAction()
        {
            switch (_knopen) {
                case 1:
                    _knopen =- 1;
                    break;
                case 2:
                    _knopen =- 1;
                    break;
                case 3:
                    _knopen =- 2;
                    break;
                case 4:
                    _knopen =- 3;
                    break;
                case 5:
                    _knopen =- 1;
                    break;
                case 6:
                    _knopen =- 2;
                    break;
                case 7:
                    _knopen =- 3;
                    break;
                default:
                    int verwijdermij =(int) (Math.random() * 3 + 1);
                    _knopen =- verwijdermij;
                    break;
            }
        }

        //Hier druk de mens op de knop en verwijderd de stenen
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int itemsverwijderen = Integer.parseInt(s);
            _knopen = _knopen - itemsverwijderen;

//            if (itemsverwijderen > 0 && itemsverwijderen < 4) {
////                _knopen = (_knopen - itemsverwijderen);
////            }

            if (s.equals(String.valueOf(1)) || s.equals(String.valueOf(2)) || s.equals(String.valueOf(3))) {
                _knopen -= itemsverwijderen;
                ComputerAction();
            }
            else if (s.equals("")) {
                response = "Voer een getal in.";
            }
            else {
                response = "Onjuist getal ingevoerd";
            }
            if (_knopen <= 0) {
                System.out.print("You lose!");
            } else if (_knopen == 1) {
                System.out.print("You win!");
            }
            tekstvak.setText("");
            repaint();
            Sleep();
            ComputerAction();
            repaint();
        }

        public void Sleep()  {
            try {
                TimeUnit.SECONDS.sleep(5);
            }
            catch(InterruptedException e)
            {
                // There was no error ever here to begin with.
            }
        }
    }
}

//  if (aantalvlagenspeler > 0 && aantalvlagenspeler < 4) {
//        aantalvlagen = (aantalvlagen - aantalvlagenspeler);
//        }