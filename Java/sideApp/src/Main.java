import javax.swing.*;
import java.awt.*;

class panelForThisApp extends JPanel {
    public Image background;

    panelForThisApp() {
        setSize(400,400);
        background = Toolkit.getDefaultToolkit().createImage("images/background.png");
        setBackground(background);

    }

    private void setBackground(Image background) {
    }
}

class stupidShapeApp extends JFrame {
    public panelForThisApp panel;

    stupidShapeApp() {
        super("Is this good?");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new panelForThisApp();
        add(panel);
    }
}

public class Main {
    public static void main(String[] args) {
        stupidShapeApp app = new stupidShapeApp();
        app.setVisible(true);
    }
}
