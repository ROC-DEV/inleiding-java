package h14.ParktijkOpdracht;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Spel extends Applet {
    private int _knopen = 23;
    private String response;
    private TextField tekstvak;
    private Button pak;
    private Label label;
    private BufferedImage afbeelding, youwin, youlose;
    private int verwijdermij;
    private boolean playerwin, computerwin;

    public void init() {
        setSize(700,700);
        tekstvak = new TextField("",20);
        pak = new Button("Pak");
        label = new Label("Vul 1,2 of 3 in.");

        pak.addActionListener(new PakEvent());

        //Afbeelding
        try {
             afbeelding = ImageIO.read(new File("D:\\Program Files (x86)\\School\\Github Repository's\\inleiding-java-Liam.S\\src\\h14\\ParktijkOpdracht\\knoppen.jpg"));
             youwin = ImageIO.read(new File("D:\\Program Files (x86)\\School\\Github Repository's\\inleiding-java-Liam.S\\src\\h14\\ParktijkOpdracht\\YouWin.jpg"));
            youlose = ImageIO.read(new File("D:\\Program Files (x86)\\School\\Github Repository's\\inleiding-java-Liam.S\\src\\h14\\ParktijkOpdracht\\YouLose.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }

        add(label);
        add(tekstvak);
        add(pak);
    }

    public void paint(Graphics g) {
        if (playerwin) {
            setSize(800, 800);
            youWin(g);

            remove(label);
            remove(tekstvak);
            remove(pak);
        }

        if (computerwin) {
            setSize(800, 800);
            youLose(g);

            remove(label);
            remove(tekstvak);
            remove(pak);
        }

        if (!computerwin && !playerwin) {
            g.drawString("" + _knopen, 50, 50);
            g.drawString("De computer verwijderde:" + verwijdermij, 50, 70);
            int x = 50, y = 100;
            if (_knopen > 12) {
                for (int i = 0; i < _knopen; i++) {
                    //draw image extra
                    g.drawImage(afbeelding, x, y, 25, 25, null);
                    y += 25;
                }
            } else {
                for (int i = 0; i < _knopen; i++) {
                    x = 100;
                    g.drawImage(afbeelding, x, y, 25, 25, null);
                    y += 25;
                }
            }

            if (response == null)
                return;

            g.drawString(response, 50, 90);
        }
    }


    private void youWin(Graphics g) {
        g.drawImage(youwin, 250,250, 250,250, null);
    }

    private void youLose(Graphics g) {
        g.drawImage(youlose, 250,250, 250,250, null);
    }

    class PakEvent implements ActionListener {

        // Hier verwijderd de computer zijn stenen
        public void ComputerAction()
        {
            switch (_knopen) {
                case 1:
                    verwijdermij = 1;
                    _knopen =_knopen - 1;
                    break;
                case 2:
                    verwijdermij = 1;
                    _knopen =_knopen - 1;
                    break;
                case 3:
                    verwijdermij = 2;
                    _knopen =_knopen - 2;
                    break;
                case 4:
                    verwijdermij = 3;
                    _knopen =_knopen - 3;
                    break;
                case 6:
                    verwijdermij = 2;
                    _knopen = _knopen - 1;
                    break;
                case 7:
                    verwijdermij = 3;
                    _knopen = _knopen - 2;
                    break;
                default:
                    verwijdermij =(int) (Math.random() * 3 + 1);
                    _knopen = _knopen - verwijdermij;
                    break;
            }
        }

        public boolean isNumeric(String strNum) {
            try {
                int d = Integer.parseInt(strNum);
            } catch (NumberFormatException | NullPointerException nfe) {
                return false;
            }
            return true;
        }

        //Hier druk de mens op de knop en verwijderd de stenen
        public void actionPerformed(ActionEvent e) {
            boolean successful = GebruikersAction();
            //if gebruiker een actie heeft uitgevoerd die niet correct is bijvoorbeeld 4 ingevoerd.
            if(!successful)
            {
                repaint();
                return;
            }

            //Hier aangekomen betekend dat de gebruiker een correcte actie heeft uitgevoerd.
            boolean verdergaan = true;
            if(_knopen == 1) {
                playerwin = true;
                verdergaan = false;
            } else if (_knopen == 0) {
                computerwin = true;
                verdergaan = false;
            }

            if(verdergaan) {
                ComputerAction();
            }
            repaint();
        }

        /**
         * Voert de gebruikers actie uit, dus verwijderd een of meerdere knopen.
         * @return true if Gebruikers actie is goed afgerond. Dus de gebruiker heeft een getal ingevoerd, dat getal ligt tussen de 1 en 3 en is nooit groter dan de hoeveelheid overgebleven knopen.
         * In alle andere gevallen geeft hij false terug.
         */
        private boolean GebruikersAction() {
            //Haal de gebruikers input op uit het tekstvak
            String s = tekstvak.getText();
            //als de waarde van de tekst leeg is dan hebben we niets te doen.
            if (s.isEmpty() || !isNumeric(s)){
                response = "Voer een getal in";
                return false;
            }
            //Converteer naar int
            int itemsverwijderen = Integer.parseInt(s);

            //als de waarde van de tekst anders is dan 1,2 of drie dan hebben we ook niets te doen.
            if(itemsverwijderen<1 || itemsverwijderen>3)
            {
                response = "Voer een getal in 1,2 of 3";
                return false;
            }

            if(itemsverwijderen > _knopen) {
                response = "Getal moet kleiner of gelijk zijn aan het aantal knopen";
                return false;
            }

            //Verminder het totaal aantal met de hoeveelheid die de gebruiker verwijderd heeft.
            _knopen = _knopen - itemsverwijderen;

            response = "";
            //Gebruikers actie is gelukt Laat de computer aan de beurt
            tekstvak.setText("");
            return true;
        }
    }
}