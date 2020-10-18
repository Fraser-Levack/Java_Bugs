import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageProducer;
import java.net.URL;

public class transparentwindow extends JFrame{
    drawdesktoppet d = new drawdesktoppet();

    public transparentwindow() {

        ImageIcon i = new ImageIcon();

        setUndecorated(true);
        drawdesktoppet d = new drawdesktoppet();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame j = new JFrame();
        JLabel l = new JLabel();

        j.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("b.png")));
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
