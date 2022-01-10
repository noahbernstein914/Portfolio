import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import java.io.*;
public class start implements ActionListener{//Makes sure we have something that lets us do when clicking
    JFrame frame;//Menu background
    JButton button;//Button for start
    JButton button1;//Button for help
    JFrame c;//Help frame
    JFrame b;//Story Frame
    JButton n;//Continue
 
JButton button2;
    public start(){
         
        button =  new JButton("START");//Create new button
        button.setBounds(650,480,200,100);//Borders of buttons
        button.addActionListener(this);//Can click now
        button.setBackground(Color.black);//Background color of button
        button.setFont(new Font("Comic Sans",Font.ITALIC,15));//Font
        button.setForeground(new Color(250,250,250));//Foreground color
        button.setBorder(BorderFactory.createEtchedBorder());//Border
        button.setFocusable(false);//Set focusable state to specific value
      //Same for all buttons
        button2 =  new JButton("RETURN");
        button2.setBounds(900,480,200,100);
        button2.addActionListener(this);
        button2.setBackground(Color.black);
        button2.setFont(new Font("Comic Sans",Font.ITALIC,15));
        button2.setForeground(new Color(250,250,250));
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setFocusable(false);
        
        button1 =  new JButton("HELP");
        button1.setBounds(1100,480,200,100);
        button1.addActionListener(this);
        button1.setBackground(Color.black);
        button1.setFont(new Font("Comic Sans",Font.ITALIC,15));
        button1.setForeground(new Color(250,250,250));
        button1.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);
        frame = new JFrame("Button Example");//New frame
        frame.setSize(new Dimension(420,420));//Dimensions of frame
        frame.setLayout(null);//SetLayout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exits when close button is pressed
        frame.add(button);//Adds compontents(frame.add(....))
        frame.add(button1);
        JLabel h = new JLabel("EXTRATERRESTRIAL COMBAT");//Title
       h.setBounds(400,40,1800,60);//Bounds of title
       h.setForeground(Color.WHITE);//Color
       h.setFont(new Font("Comic Sans", Font.BOLD, 80));//Font
        frame.add(h);
        frame.getContentPane().setBackground(Color.BLUE);//Returns content pane obejct for frame
        frame.setVisible(true);//Shows frame depending on value
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);//Maximizes screen size
       
//Same for all frame objects
    }
 
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button) {// If button is pressed. Same for all if statements
        n =  new JButton("CONTINUE");//Title of button
        n.setBounds(1100,480,200,100);
        n.addActionListener(this);
        n.setBackground(Color.black);
        n.setFont(new Font("Comic Sans",Font.ITALIC,15));
        n.setForeground(new Color(250,250,250));
        n.setBorder(BorderFactory.createEtchedBorder());
        n.setFocusable(false);
 
        JLabel h = new JLabel("The year is 3055. The evil Scuterco has taken over the galaxy.");
            h.setBounds(80,30,1800,60);//Location, height and width of label
            h.setForeground(Color.WHITE);//Color
            h.setFont(new Font("Comic Sans", Font.BOLD, 50));//Font and size
            // Same for all jlabels
            JLabel c = new JLabel("However, to brave heroes, JKizzy and BBeats are combating this evil.");
            c.setBounds(80,90,1800,60);
            c.setForeground(Color.WHITE);
            c.setFont(new Font("Comic Sans", Font.BOLD, 50));
            
            JLabel f = new JLabel("With only a photon blaster and fists this will be no easy tasks.");
            f.setBounds(80,140,1800,60);
            f.setFont(new Font("Comic Sans", Font.BOLD, 50));
            f.setForeground(Color.WHITE);
            
            JLabel q = new JLabel("However, with your help our heroes can defeat");
            q.setBounds(80,180,1800,60);
            q.setFont(new Font("Comic Sans", Font.BOLD, 50));
            q.setForeground(Color.WHITE);
            
            JLabel s = new JLabel(" his minions and restore peace to the galaxy.");
            s.setBounds(80,230,1800,60);
            s.setFont(new Font("Comic Sans", Font.BOLD,50));
            s.setForeground(Color.WHITE);
 
          b = new JFrame("STORY");
            b.setSize(new Dimension(1920,1080));
            b.setLayout(null);
            b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            b.getContentPane().setBackground(Color.RED);
            b.setVisible(true);
            b.setExtendedState(JFrame.MAXIMIZED_BOTH);
            b.add(n);
            b.add(q);
            b.add(s);
            b.add(h);
            b.add(f);
            b.add(c);
        }
            
        if(e.getSource()==n) {
          
          GameOption q = new GameOption();
          q.start();// starts the game when continue is pressed
          
        }
          
        
        if(e.getSource()==button1) {
          JLabel a = new JLabel("1. Use A to move right and S to move left ");
            a.setBounds(80,30,1800,60);
            a.setForeground(Color.WHITE);
            a.setFont(new Font("Comic Sans", Font.BOLD, 50));
            JLabel v = new JLabel("2. Space to jump");
            v.setBounds(80,80,1800,60);
           v.setFont(new Font("Comic Sans", Font.BOLD, 50));
            v.setForeground(Color.WHITE);
 
            JLabel g = new JLabel("3. Mousepad to aim");
            g.setBounds(80,130,1800,60);
            g.setFont(new Font("Comic Sans", Font.BOLD, 50));
            g.setForeground(Color.WHITE);
            
            JLabel q = new JLabel("4. Shift to punch");
            q.setBounds(80,180,1800,60);
            q.setFont(new Font("Comic Sans", Font.BOLD, 50));
            q.setForeground(Color.WHITE);
 
            JLabel w = new JLabel("5. P to pause O to resume");
            w.setBounds(80,240,1800,60);
            w.setFont(new Font("Comic Sans", Font.BOLD, 50));
            w.setForeground(Color.WHITE);
            
            JLabel b = new JLabel("6. K to quit game");
            b.setBounds(80,290,1800,60);
            b.setFont(new Font("Comic Sans", Font.BOLD, 50));
            b.setForeground(Color.WHITE);
 
            JLabel s = new JLabel("7. Try to kill as many  bad guys as you can");
            s.setBounds(80,340,1800,60);
            s.setFont(new Font("Comic Sans", Font.BOLD, 50));
            s.setForeground(Color.WHITE);
            
            c = new JFrame("HELP");
            c.setSize(new Dimension(1920,1080));
            c.setLayout(null);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.getContentPane().setBackground(Color.BLACK);
            c.add(a);
            c.add(v);
            c.add(g);
            c.add(q);
            c.add(b);
            c.add(button2);
            c.add(s);
            c.add(w);
            c.setVisible(true);
            c.setExtendedState(JFrame.MAXIMIZED_BOTH);
          }
          if(e.getSource()==button2)
            {
              c.dispose();//Returns to main menu
            }
 
    }
}

