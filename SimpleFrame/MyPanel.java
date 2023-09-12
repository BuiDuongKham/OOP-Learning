package SimpleFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

// Notes: JPanel is required to fill all pixels in it, JComponent isn't. Therefore, JPanel can set BG.
public class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        Rectangle2D.Double rectDouble = new Rectangle2D.Double(10.0, 25.0, 22.5, 20.9);
        Point2D p1 = new Point2D.Double(10,20);
        Point2D p2 = new Point2D.Double(70, 90);
        g2.draw(rectDouble);
        g2.setPaint(Color.RED);
        g2.draw(new Line2D.Double(p1, p2));
        g2.setPaint(new Color(0x67EF00));
        Point2D centerPoint = new Point2D.Double(50, 50);
        Dimension dimension = new Dimension(100,30);
        Ellipse2D ellipse2D = new Ellipse2D.Double( centerPoint.getX() - dimension.getWidth()/2, centerPoint.getY() - dimension.getHeight()/2, dimension.getWidth(), dimension.getHeight() );
        g2.draw(ellipse2D);
    }
}
