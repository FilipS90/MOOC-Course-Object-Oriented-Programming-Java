/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Filip
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String,Set<String>> entries = new HashMap<String,Set<String>>();
    
    @Override
    public void add(String word, String entry) {
        Set<String> s = entries.get(word);
        if(entries.get(word)==null){
            s = new HashSet<String>();
            entries.put(word, s);
        }
            s.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> list = entries.get(word);
        return list;
    }

    @Override
    public void remove(String word) {
        entries.remove(word);
    }
    
}
