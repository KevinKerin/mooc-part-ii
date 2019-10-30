/*
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author kevinkerin
 */
public class Player {

    private int x, y, length, height;

    public Player(int length, int height) {
        x = 0;
        y = 0;
        this.length = length;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void changePosition(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'w':
                    if (getY() > 0) {
                        setY(y - 1);
                    }
                    break;
                case 'a':
                    if (getX() > 0) {
                        setX(x - 1);
                    }
                    break;
                case 's':
                    if (getY() < height-1) {
                        setY(y + 1);
                    }
                    break;
                case 'd':
                    if (getX() < length-1) {
                        setX(x + 1);
                    }
                    break;
                default:
                    break;
            }
        }
        //System.out.println("Player position: " + toString());
    }

    public String toString() {
        return "X: " + getX() + "; Y: " + getY();
    }
}