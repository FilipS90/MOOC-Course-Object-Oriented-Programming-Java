/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Filip
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> lista = new HashSet<String>();
    private int duplicates;
    
    @Override
    public void add(String word) {
        if(lista.contains(word)){
            duplicates++;
        }
        lista.add(word);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return lista;
    }

    @Override
    public void empty() {
        lista.clear();
        duplicates=0;
    }
    
}
