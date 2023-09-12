package SimpleFrame;

import jdk.jfr.Event;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(
            () ->
            {
                SimpleFrame simpleFrame = new SimpleFrame();
                simpleFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                Image icon = new ImageIcon("icon.jpeg").getImage();
                simpleFrame.setIconImage(icon);
                simpleFrame.setTitle("Entry Frame");
                simpleFrame.setVisible(true);
                simpleFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
            }
        );
    }
}
