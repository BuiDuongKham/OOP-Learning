package SimpleFrame;

import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel
{
    public int diameter;
    public Ball(int x, int y, int diameter)
    {
        super();
        this.setLocation(x, y);
        this.setSize(diameter, diameter);
        this.diameter = diameter;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(0, 0, this.diameter , this.diameter);
    }
}