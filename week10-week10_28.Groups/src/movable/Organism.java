/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author kevinkerin
 */
public class Organism implements Movable {

    private int x, y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
    
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public static void main(String[] args) {
        Group group = new Group();
    group.addToGroup(new Organism(73, 56));
    group.move(4, 4);
    group.addToGroup(new Organism(57, 66));
    group.addToGroup(new Organism(46, 52));
    group.addToGroup(new Organism(19, 107));
    System.out.println(group);
        System.out.println("-----");
    group.move(10, -10);
        System.out.println(group);
    }
    
}
