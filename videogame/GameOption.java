/**
 * Author: Mr. Scutero
 * Purpose: to give the option to play the game
 */

import javax.swing.JOptionPane;

public class GameOption
{
    private GameFrame lotf;
    
    public GameOption()
    {
        lotf = new GameFrame();
    }
    
    public void start()
    {

        lotf.display();

    }
}
