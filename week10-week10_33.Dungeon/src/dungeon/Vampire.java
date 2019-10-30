/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author kevinkerin
 */
public class Vampire {

    private int x;
    private int y;
    private int length;
    private int height;

    public Vampire(int length, int height) {
        x = (int) (Math.random() * length - 1);
        y = (int) (Math.random() * length - 1);
        this.length = length;
        this.height = height;
    }

    public void setX(int x) {
        if (x > 0 && x <= length) {
            this.x = x;
        } else {
            if (x == 0) {
                this.x = 1;
            } else {
                this.x = length;
            }
        }
    }

    public void setY(int y) {
        if (y > 0 && y <= length) {
            this.y = y;
        } else {
            if (y == 0) {
                this.y = 1;
            } else {
                this.y = length;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void changePosition(int steps) {
        while (steps > 0) {
            double random = Math.random();
            if (random >= 0.5) {
                if (random >= 0.75) {
                    setX(x + 1);
                } else {
                    setX(x - 1);
                }
            } else {
                if (random >= 0.25) {
                    setY(y + 1);
                } else {
                    setY(y - 1);
                }
            }
            steps--;
        }
        //System.out.println("Vampire: " + toString());
    }

    public String toString() {
        return "X: " + getX() + "; Y: " + getY();
    }

}
