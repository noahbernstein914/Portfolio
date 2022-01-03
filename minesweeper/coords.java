import java.awt.PointerInfo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.MouseInfo;
import java.awt.Point;

public class coords {
    public static void main(String[] args) {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int locx = (int) b.getX();
        int locy = (int) b.getY();
        Boolean e = true;
       
                    int x = 0;
                    int y = 0;
                    final JFrame tframe = new JFrame("Frame");
                    tframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    tframe.setAlwaysOnTop(true);
                    tframe.setSize(540, 0);
                    tframe.setLocation(112, 312);
                    tframe.setVisible(true);
                    final JFrame bframe = new JFrame("Frame");
                    bframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    bframe.setAlwaysOnTop(true);
                    bframe.setSize(540, 0);
                    bframe.setLocation(167, 731);
                    bframe.setVisible(true);
                    
                    final JFrame lframe = new JFrame("Frame");
                    lframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    lframe.setAlwaysOnTop(true);
                    lframe.setSize(0, 420);
                    lframe.setLocation(32, 312);
                    lframe.setVisible(true);
                    final JFrame rframe = new JFrame("Frame");
                    rframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    rframe.setAlwaysOnTop(true);
                    rframe.setSize(0, 420);
                    rframe.setLocation(572, 312);
                    rframe.setVisible(true);
                
          
        
        while (e) {
             a = MouseInfo.getPointerInfo();
         b = a.getLocation();
            if (b.getX() != locx || b.getY() != locy) {
                System.out.println("_________\nX: " + locx + "\nY: " + locy);
               locx = (int) b.getX();
                locy = (int) b.getY();
            }
        }
    }
}
