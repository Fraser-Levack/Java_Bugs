import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class drawdesktoppet extends JPanel implements ActionListener {

    URL b = getClass().getClassLoader().getResource("b.gif");
    URL bback = getClass().getClassLoader().getResource("bback.gif");

    ImageIcon i = new ImageIcon();

    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    Timer flower = new Timer(8000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    Timer t = new Timer(3000, this);
    Timer t2 = new Timer(1, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            x += velX;
            y += velY;
            if (x >= (int) screen.getWidth()) {
                velX = -velX;
            }

            else if (x <= (int)(screen.getWidth() - screen.getWidth())) {
                velX = Math.abs(velX);
            }

            else if (y >= (int) screen.getHeight()) {
                velY = -velY;
            }

            else if (y <= (int)(screen.getHeight() - screen.getHeight())) {
                velY = Math.abs(velY);
            }
            else if (velX == -1){
                    i = new ImageIcon(bback);

            }
            else if (velX == 1){
                    i = new ImageIcon(b);
            }
            else if (velX == 0) {
                i = new ImageIcon(b);
            }
        }
    });
    int x = 70, y = 70, velX = 0, velY = 0;


    public void paintComponent(Graphics g) {
        t2.start();
        t.start();
        setOpaque(false);
        super.paintComponent(g);
        i.paintIcon(this, g, x, y);
        repaint();
    }

    public static void main(String[] args) {
        new drawdesktoppet();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //velX = (int) (Math.random()*2 - 1 );
        //velY = (int) (Math.random()*2 -1 );
        int forx = (int)(Math.random()*31);
        int fory = (int)(Math.random()*31);

        if (forx >= 0 && forx <= 10) {
            velX = 1;
        }
        if (forx >= 11 && forx <= 20) {
            velX = 0;
        }
        if (forx >= 21 && forx <= 30) {
            velX = -1;
        }

        if (fory >= 0 && fory <= 10) {
            velY = 1;
        }
        if (fory >= 11 && fory <= 20) {
            velY = 0;
        }
        if (fory >= 21 && fory <= 30) {
            velY = -1;
        }
        }
    }
