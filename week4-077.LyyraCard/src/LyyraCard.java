/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double i){
        this.balance=i;
    }
    
    @Override
    public String toString(){
        String s="The card has "+balance+" euros";
        return s;
    }
    
    public void payEconomical(){
        if(balance>=2.5)
            balance-=2.50;
    }
    
    public void payGourmet(){
        if(balance>=4)
            balance-=4;
    }
    
    public void loadMoney(double a){
        if(a<1)
            return;
        if(balance+a<=150)
            balance+=a;
        else
            balance=150;
        
    }
    
    
}
