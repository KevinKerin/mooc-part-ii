/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author kevinkerin
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        boolean[][] board = getBoard();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                double random = Math.random();
                if (random <= probabilityForEachCell) {
                    board[i][j] = true;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (!(x > getWidth() - 1 || x < 0 || y > getHeight() - 1 || y < 0)) {
            boolean[][] board = getBoard();
            return board[x][y];
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (!(x > getWidth() - 1 || x < 0 || y > getHeight() - 1 || y < 0)) {
            boolean[][] board = getBoard();
            board[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (!(x > getWidth() - 1 || x < 0 || y > getHeight() - 1 || y < 0)) {
            boolean[][] board = getBoard();
            board[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        boolean[][] board = getBoard();
        int counter = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                if (isAlive(i, j)){
                    counter++;
                }
            }
        }
        if(isAlive(x, y)){
            counter--;
        }
        return counter;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        boolean[][] board = getBoard();
        if(getNumberOfLivingNeighbours(x, y) < 2){
            turnToDead(x, y);
        } else if(getNumberOfLivingNeighbours(x, y) > 3){
            turnToDead(x, y);
        } else if (getNumberOfLivingNeighbours(x, y) == 3){
            turnToLiving(x, y);
        }
    }

}
