/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Filip
 */
public class AtLeastOne implements Criterion {
    private Criterion[] c;
    
    public AtLeastOne(Criterion... criterion) {
        this.c = criterion;
    }
    
     @Override
    public boolean complies(String line) {
        for (Criterion criterion : c) {
            if (criterion.complies(line)) {
                return true;
            }
        }
        return false;
    }
    
}
