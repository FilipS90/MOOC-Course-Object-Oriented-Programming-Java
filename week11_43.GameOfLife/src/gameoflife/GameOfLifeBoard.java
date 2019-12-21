/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author Filip
 */
public  abstract class GameOfLifeBoard {
    private boolean[][] board;
    
    public GameOfLifeBoard(int length, int height){
        this.board=new boolean[length][height];
    }
    
    public boolean[][] getBoard(){
        return board;
    }
    
    public int getWidth(){
        return board[0].length;
    }
    
    public int getHeight(){
        return board.length;
    }
    
    public void playTurn(){
        
    }
    
    public abstract void turnToLiving(int x,int y);
    public abstract void turnToDead(int x,int y);
    public abstract boolean isAlive(int x,int y);
    public abstract void initiateRandomCells(double probabilityForEachCell);
    public abstract int getNumberOfLivingNeighbours(int x,int y);
    public abstract void manageCell(int x, int y, int livingNeighbours);

    
    
    
}
