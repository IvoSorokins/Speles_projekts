package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    public void KeyTyped(KeyEvent e) {
    }
    public void KeyPressed(KeyEvent e) {//pārbauda kuru pogu uzspiež lai kustinātu cilveku
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = true;
        }
        if(code == KeyEvent.VK_S){
            downPressed ==  true;
        }
        if(code == KeyEvent.VK_A){
            leftPressed == true;
        }
        if(code == KeyEvent.VK_D){
            rightPressed == true;
        }
    }

    public void KeyReleased(KeyEvent e) {//pārbauda vai ir poga atlaista
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = false;
        }
        if(code == KeyEvent.VK_S){
            downPressed ==  false;
        }
        if(code == KeyEvent.VK_A){
            leftPressed == false;
        }
        if(code == KeyEvent.VK_D){
            rightPressed == false;
        }
    }
}