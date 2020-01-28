package me.friwi.javalessons.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game implements KeyListener, MouseListener {
    //TODO Add variables representing your game state here

    public void onTick(){
        //TODO Do some game logic
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //Use if you need it. Works only for letters. Typed == press followed by release
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        //TODO Fill out key event.
        System.out.println("Key with char \'"+keyEvent.getKeyChar()+"\' [code="+keyEvent.getKeyCode()+"] was pressed");
        if(keyEvent.getKeyCode()==KeyEvent.VK_LEFT){
            //Left arrow was typed
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        //Use if you need it
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        //TODO Fill out mouse event. Clicked == press followed by release
        System.out.println("Mouse was clicked at "+mouseEvent.getX()+", "+ mouseEvent.getY());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        //Use if you need it
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        //Use if you need it
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        ////Use if you need it. Called when cursor enters the game panel
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        ////Use if you need it. Called when cursor leaves the game panel
    }
}
