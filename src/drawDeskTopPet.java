import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

public class drawDeskTopPet extends JPanel implements ActionListener {

    URL beeURL = getClass().getClassLoader().getResource("beeZ.gif");
    URL beeBackSideURL = getClass().getClassLoader().getResource("beeBackSide.gif");

    ImageIcon imageIcon = new ImageIcon();

    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    Timer timer1;
    Timer timer2 = new Timer(1, new ActionListener() {
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
                    imageIcon = new ImageIcon(beeBackSideURL);

            }
            else if (velX == 1){
                    imageIcon = new ImageIcon(beeURL);
            }
            else if (velX == 0) {
                imageIcon = new ImageIcon(beeURL);
            }
        }
    });
    int x = (int)(Math.random()*screen.getWidth()), y = (int)(Math.random()*screen.getHeight()), velX = 0, velY = 0;

    public drawDeskTopPet() {
        timer1 = new Timer(3000, this);
    }


    public void paintComponent(Graphics graphics) {
        timer2.start();
        timer1.start();
        setOpaque(false);
        super.paintComponent(graphics);
        imageIcon.paintIcon(this, graphics, x, y);
        repaint();
    }

    public static void main(String[] args) {
        new drawDeskTopPet();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //velX = (int) (Math.random()*2 - 1 );
        //velY = (int) (Math.random()*2 -1 );
        int forEachXValue = (int)(Math.random()*31);
        int forEachYValue = (int)(Math.random()*31);
        // put both x and y into arrays and use a for each loop to iterate through them
        ArrayList<Integer> valuesXAndY = new ArrayList<>();
        valuesXAndY.add(forEachXValue);
        valuesXAndY.add(forEachYValue);

        for (int value : valuesXAndY) {
            if (value >= 0 && value <= 10) {
                velX = 1;
            }
            if (value >= 11 && value <= 20) {
                velX = 0;
            }
            if (value >= 21 && value <= 30) {
                velX = -1;
            }
            }
        }
    }
