
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Calculator {
    private Reader sc = new Reader();
    private int calculations=0;
    
    public Calculator(){
        
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = sc.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private int input(){
        System.out.println("Value1: ");
        int f = sc.readInteger();
        return f;
    }
    
    private void sum(){
        int f = input();
        int n = input();
        calculations++;
        
        System.out.println("sum of the values "+(f+n));
    }
    
    private void difference(){
        int f = input();
        int n = input();
        calculations++;
        
        System.out.println("difference of the values "+(f-n));
    }
    
    private void product(){
        int f = input();
        int n = input();
        calculations++;
        
        System.out.println("product of the values "+(f*n));
    }
    
    private void statistics(){
        System.out.println("Calculations done "+calculations);
    }
}
