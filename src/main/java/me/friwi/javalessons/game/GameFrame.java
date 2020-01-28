package me.friwi.javalessons.game;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame implements Runnable {
    private Game game;
    private GamePanel panel;
    public GameFrame(){
        this.game = new Game();
        this.setTitle("Pong");
        this.setLayout(new BorderLayout());
        panel = new GamePanel(game);
        this.addKeyListener(game);
        panel.addMouseListener(game);
        this.add(panel, BorderLayout.CENTER);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true){
            game.onTick();
            panel.repaint();
            try {
                Thread.sleep(50 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
