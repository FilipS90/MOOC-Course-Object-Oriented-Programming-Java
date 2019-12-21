/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author Filip
 */
public class PersonalBoard extends GameOfLifeBoard {
    
    public PersonalBoard(int length, int height) {
        super(length, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        if(x>getWidth()-1 || y>getHeight()-1 || x<0 || y<0)
            return;
        getBoard()[x][y] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        if(x>getWidth()-1 || y>getHeight()-1 || x<0 || y<0)
            return;
        getBoard()[x][y] = false;
    }

    @Override
    public boolean isAlive(int x, int y) {
         if(x>getWidth()-1 || y>getHeight()-1 || x<0 || y<0)
            return false;
         return getBoard()[x][y];
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for(int i=0;i<getWidth();i++){
            for(int n=0;n<getHeight();n++){
                if(Math.random()<probabilityForEachCell)
                    turnToLiving(i,n);
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int n=0;
        for(int i=y-1;i<=y+1;i++){
            for(int q=x-1;q<=x+1;q++){
                if(q==x && i==y)
                    continue;
                if(isAlive(q,i)==true)
                    n++;
            }
        }
        return n;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(getNumberOfLivingNeighbours(x,y)<2)
            turnToDead(x,y);
        if(getNumberOfLivingNeighbours(x,y)>3)
            turnToDead(x,y);
        if(isAlive(x,y)==false && getNumberOfLivingNeighbours(x,y)==3)
            turnToLiving(x,y);
    }
    
}
