/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class MilitaryService implements NationalService {
    private int daysLeft;
    
    public MilitaryService(int days){
        this.daysLeft=days;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if(daysLeft>0)
            daysLeft--;
    }
    
    
}
