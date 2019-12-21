/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Filip
 */
public class WordInspection {
    private int lines;
    private List<String> wordsWithZ = new ArrayList<String>();
    private List<String> wordsWithL = new ArrayList<String>();
    private List<String> palindrome = new ArrayList<String>();
    private List<String> vowels = new ArrayList<String>();
    
    public WordInspection(File file)throws Exception{
        Scanner sc = new Scanner(file, "UTF-8");
        int n = 0,p=0;
        String line = "";
        
        while(sc.hasNextLine()){
            lines++;
            line = sc.nextLine();
            p=line.length()-1;
            if(line.contains("z"))
                wordsWithZ.add(line);
            if(line.charAt(line.length()-1) == 'l')
                wordsWithL.add(line);
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)!=line.charAt(p))
                    break;
                else if(line.charAt(i)==line.charAt(p) && i==line.length()-1)
                    palindrome.add(line);
                p--;
            }
            if(line.contains("a") && line.contains("e") && line.contains("i")
                    && line.contains("o") && line.contains("u") && line.contains("y")
                    && line.contains("ä") && line.contains("ö"))
                vowels.add(line);
        }
    }
    
    public int wordCount(){
       return lines;
    }
    
    public List<String> wordsContainingZ(){
        return wordsWithZ;
    }
    
    public List<String> wordsEndingInL(){
        return wordsWithL;
    }
    
    public List<String> palindromes(){
        return palindrome;
    }
    
    public List<String> wordsWhichContainAllVowels(){
        return vowels;
    }
    
    
}
