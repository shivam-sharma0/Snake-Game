import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;
    SnakeGame(){
        board=new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        //Intialize the sanke

        SnakeGame snakegame=new SnakeGame();
    }

    //Draw images at snake and apple's Position


}