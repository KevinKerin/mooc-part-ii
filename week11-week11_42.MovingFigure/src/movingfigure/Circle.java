/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author kevinkerin
 */
public class Circle extends Figure {
    
    private int diameter;
    
    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }
    
    @Override
    public void draw(Graphics graphics){
        graphics.fillOval(getX(), getY(), diameter, diameter);
    }
    
    @Override
    public void move(int dx, int dy){
        super.move(dx, dy);
    }
}
