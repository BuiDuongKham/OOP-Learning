package SimpleFrame;

import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame {
    private static final int DEFAULT_HEIGHT = 200;
    private static final int DEFAULT_WIDTH = 300;

    public SimpleFrame() throws HeadlessException {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth/2 , screenHeight/2);
        setLocationByPlatform(true);
//        MyPanel myPanel = new MyPanel();
////        myPanel.setForeground(new Color(0x0000FA));
//        myPanel.setBackground(new Color(0x0000FA).darker().darker().darker());
        Ball myBall = new Ball(100, 200, 200 );
        this.add(myBall);
    }
}
