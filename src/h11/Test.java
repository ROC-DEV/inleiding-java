package h11;

        import java.applet.Applet;
        import java.awt.*;

public class Test extends Applet {

    int x;
    int y;
    int breedte;
    int hoogte;


    public void paint(Graphics g) {
        y = 50;
        x = 50;
        Rijen(g, Color.BLACK, Color.WHITE);

        //tweede rij
        x = 50;
        y += hoogte;

        Rijen(g, Color.WHITE, Color.BLACK);


        Rijen(g, Color.BLACK, Color.WHITE);

        //tweede rij
        x = 50;
        y += hoogte;

        Rijen(g, Color.WHITE, Color.BLACK);


        Rijen(g, Color.BLACK, Color.WHITE);

        //tweede rij
        x = 50;
        y += hoogte;

        Rijen(g, Color.WHITE, Color.BLACK);


        Rijen(g, Color.BLACK, Color.WHITE);

        //tweede rij
        x = 50;
        y += hoogte;

        Rijen(g, Color.WHITE, Color.BLACK);
    }

    private void Rijen(Graphics g, Color black, Color white) {
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
    }

}