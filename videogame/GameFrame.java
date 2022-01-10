/**
 * Author: Mr. Scutero
 * Date: 5/12/2021
 * 
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class GameFrame extends JFrame {
    private JFrame frame;
    private GamePanel panel;

    public GameFrame() {
        frame = new JFrame("Overthrow ScuteroCo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new GamePanel();
        panel.setPreferredSize(new Dimension(700,500));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setBackground(Color.black);
        frame.setCursor(frame.getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
                new Point(0, 0), "null"));
        frame.getContentPane().add(panel);
    }

    public void display() {
        frame.pack();
        frame.setVisible(true);
    }
}