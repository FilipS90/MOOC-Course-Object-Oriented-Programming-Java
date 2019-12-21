/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class StringUtils {
    
    public static boolean included(String word, String searched){
        word = word.toLowerCase().trim();
        searched = searched.toLowerCase().trim();
        
        if(word.contains(searched))
            return true;
        return false;
    }
}
