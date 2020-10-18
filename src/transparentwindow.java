import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageProducer;

public class transparentwindow extends JFrame{

    public transparentwindow() {
        setUndecorated(true);
        drawdesktoppet d = new drawdesktoppet();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame j = new JFrame();
        JLabel l = new JLabel();


        j.setUndecorated(true);
        j.setSize(screenSize.getSize());
        j.setAlwaysOnTop(true);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.add(d);
        j.setBackground(new Color(0, 0, 0, 0));
        j.setVisible(true);

    }

    public static void main(String[] args) {
        new transparentwindow();
    }
}
