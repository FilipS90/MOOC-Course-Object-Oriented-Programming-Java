
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int stars=0;
    
    public NightSky(double density){
        this.density=density;
        this.width=20;
        this.height=10;
    }
    
    public NightSky(int width,int height){
        this.density=0.1;
        this.width=width;
        this.height=height;
    }
    
    public NightSky(double density, int width, int height){
        this.density=density;
        this.width=width;
        this.height=height;
    }
    
    public void printLine(){
        Random rand = new Random();
        int x=0;
        double n=0, rangeMin=0.01,rangeMax=1;
            for(int m=0;m<width;m++){
                n=rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
                if(n>0 && n<=density){
                    System.out.print("*");
                    x++;
                }
                else
                    System.out.print(" ");
                if(m+1==width)
                    System.out.println("");
            }
            stars+=x;
    }
    
    public void print(){
        stars=0;
        for(int i=0;i<height;i++){
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint(){
        return stars;
            }     
    
}
