/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Filip
 */
public class Analysis {
    private int lines=0;
    private char chars=0;
    private Scanner sc;
    
    public Analysis(File file) throws Exception{
        sc = new Scanner (file);
    }
    
    public int lines()throws Exception{
        characters();
        return lines;
    }
    
    public int characters() throws Exception{
        int n=0,x=0;
        String line="";
        
        while(sc.hasNextLine()){
            line = sc.nextLine();
            n+=line.length()+1;
            x++;
        }
        lines+=x;
        chars+=n;
        return chars;
    }
    
    
}
