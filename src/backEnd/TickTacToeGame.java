package backEnd;

import frontEnd.GameWindow;

public class TickTacToeGame implements Runnable{
    private final int BOARD_SIZE = 3,
            TICKS = 60;
    private int board[][],
            boardSectionX,
            boardSectionY;
    private Player player1,
            player2;
    private GameState currentGameState;
    private Thread gameThread;

    private GameWindow gameWindow;

    public TickTacToeGame() {

        currentGameState = GameState.GAMEPLAY;
        player1 = new Player();
        player2 = new Player();
        board = new int[BOARD_SIZE][BOARD_SIZE];
    }

    public void run() {

        gameWindow = new GameWindow();
    }
}
