import javax.swing.*;
import java.awt.*;

public class transparentWindow extends JFrame{

    public transparentWindow() {

        setUndecorated(true);

        drawDeskTopPet bee = new drawDeskTopPet();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame jFrame = new JFrame();

        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bee.png")));
        jFrame.setUndecorated(true);
        jFrame.setSize(screenSize.getSize());
        jFrame.setAlwaysOnTop(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(bee);
        jFrame.setBackground(new Color(0, 0, 0, 0));
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new transparentWindow();
    }
}
