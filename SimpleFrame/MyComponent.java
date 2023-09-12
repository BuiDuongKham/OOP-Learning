package SimpleFrame;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent {
    public static final int MESSAGE_X = 0;
    public static final int MESSAGE_Y = 20;
    public static final int DEFAULT_HEIGHT = 300;
    public static final int DEFAULT_WIDTH = 200;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Not a Hello World Program", MESSAGE_X, MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
