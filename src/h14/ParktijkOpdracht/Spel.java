package h14.ParktijkOpdracht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Spel extends Applet {
    private int _knopen = 23;
    private TextField tekstvak;
    private Button pak;

    public void init() {
        tekstvak = new TextField("",20);
        pak = new Button("Pak");

        pak.addActionListener(new PakEvent());

        add(pak);
        add(tekstvak);
        repaint();
    }

    public void paint(Graphics g) {

    }

    class PakEvent implements ActionListener {

        // Hier verwijderd de computer zijn stenen
        public void ComputerAction()
        {
            switch (_knopen) {
                case 1:
                    _knopen = _knopen - 1;
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
                    int verwijdermij =(int) (Math.random() * 3);
                    _knopen =- verwijdermij;
                    break;
            }
        }

        //Hier druk de mens op de knop en verwijderd de stenen
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int itemsverwijderen = Integer.parseInt(s);
            _knopen = _knopen - itemsverwijderen;

            if (_knopen == 0) {
                System.out.print("You lose!");
            }
            repaint();
            Sleep();
            ComputerAction();
            repaint();
        }

        public void Sleep()  {
            try {
                TimeUnit.SECONDS.sleep(3);
            }
            catch(InterruptedException e)
            {
                // There was no error ever here to begin with.
            }
        }
    }
}