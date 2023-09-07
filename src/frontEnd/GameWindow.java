package frontEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameWindow extends JFrame{
    private GamePlayPanel gamePlayPanel;
    public GameWindow() throws HeadlessException {

        gamePlayPanel = new GamePlayPanel();
        this.setTitle("TickTacToe");
        this.add(gamePlayPanel);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
