/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author kevinkerin
 */
public class KeyboardListener implements KeyListener{

    private Component c;
    private Figure f;

    public KeyboardListener(Component c, Figure f) {
        this.c = c;
        this.f = f;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                f.move(-5, 0);
                break;
            case KeyEvent.VK_RIGHT:
                f.move(5, 0);
                break;
            case KeyEvent.VK_UP:
                f.move(0, -5); 
                break;
            case KeyEvent.VK_DOWN:
                f.move(0, 5);
                break;
            default:
                break;
        }
        
        c.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
