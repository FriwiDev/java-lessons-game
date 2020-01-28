package me.friwi.javalessons.game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Game game;

    public GamePanel(Game game){
        this.game = game;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(500, 300));
    }

    @Override
    public void paint(Graphics graphics){
        if(graphics instanceof Graphics2D){
            Graphics2D g = (Graphics2D) graphics;

            //TODO draw your game here - you can access your variables from the "Game" class using the attribute "game"
            g.setColor(Color.RED);
            g.drawString("Test output", 100, 100);
        }
    }
}
