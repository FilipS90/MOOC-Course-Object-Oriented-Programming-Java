
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class ShoppingBasket {
    private List<Purchase> lista = new ArrayList<Purchase>();
    
    public ShoppingBasket(){
        
    }
    
    public void add(String s, int price){
        for(Purchase p:lista){
            if(p.getProduct().equalsIgnoreCase(s)){
                Purchase x = new Purchase(s,p.getAmount()+1,price);
                lista.remove(p);
                lista.add(x);
                return;
            }
           }
        Purchase x = new Purchase(s,1,price);
        lista.add(x); 
        }
    
    
    public int price(){
        int t=0;
        for(Purchase p:lista){
            t+=p.price();
        }
        return t;
    }
    
    public void print(){
        for(Purchase p:lista){
            System.out.println(p.getProduct()+": "+p.getAmount());
        }
    }
    
    
}
