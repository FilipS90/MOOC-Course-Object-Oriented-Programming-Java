/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Flight {
    private String departCode;
    private String destCode;
    
    public Flight(String depart, String dest){
        this.departCode=depart;
        this.destCode=dest;
    }
    
    public String getDepart(){
        return departCode;
    }
    
    public String getDest(){
        return destCode;
    }
   
    public String toString(){
        String s = "("+departCode+"-"+destCode+")";
        return s;
    }
}
