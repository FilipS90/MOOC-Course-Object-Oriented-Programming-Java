/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int un){
        this.product=product;
        this.amount=amount;
        this.unitPrice=un;
    }
    
    public int price(){
        return unitPrice*amount;
    }
    
    public String getProduct(){
        return product;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void increaseAmount(){
        amount++;
    }
    
    public String toString(){
        String s=product+": "+amount;
        return s;
    }
    
    
    
    
}
