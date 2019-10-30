/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kevinkerin
 */
public class Dungeon {

    private int length, height, vampires, moves;
    private boolean vampiresMove;
    private List<Vampire> vampireList;
    private Player player;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        vampireList = new ArrayList<Vampire>();
        player = new Player(length, height);
        reader = new Scanner(System.in);
    }

    public void run() {
        createVampire(vampires);
        beginRound(reader);
    }

    public void createVampire(int vampires) {
        for (int i = 0; i < vampires; i++) {
            boolean duplicate = false;
            Vampire v = new Vampire(length, height);
            for (Vampire vam : vampireList) {
                if (vam.getX() == v.getX() && vam.getY() == v.getY()) {
                    i--;
                    duplicate = true;
                }
            }
            if (!duplicate) {
                vampireList.add(v);
            }
        }
    }

    public void beginRound(Scanner reader) {
        System.out.println(moves + "\n");
        moves--;

        System.out.println("@ " + player.getX() + " " + player.getY());
        for (Vampire v : vampireList) {
            System.out.println("v " + v.getX() + " " + v.getY());
        }
        System.out.println("");
        printDots();
        System.out.println("");
        //System.out.println("w = up, a = left, s = down, d = right");
        String str = reader.nextLine();
        player.changePosition(str);
        if (vampiresMove) {
            for (Vampire v : vampireList) {
                v.changePosition(str.length());
            }
        }
        checkForDeadVampires();
        if (vampireList.isEmpty()) {
            System.out.println("YOU WIN");
        } else {
            if (moves > 0) {
                beginRound(reader);
            } else {
                System.out.println("YOU LOSE");
            }
        }
    }

    public void printDots() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                boolean printV = false;
                for (Vampire v : vampireList) {
                    if (v.getX() == j && v.getY() == i) {
                        printV = true;
                    }
                }
                if (printV) {
                    System.out.print("v");
                } else if (player.getX() == j && player.getY() == i) {
                    System.out.print("@");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("\r");
        }
    }

    public void checkForDeadVampires() {
        Vampire vam = null;
        for (Vampire v : vampireList) {
            if (v.getX() == player.getX() && v.getY() == player.getY()) {
                vam = v;
            }
        }

        if (vam != null) {
            vampireList.remove(vam);
        }
    }
}
