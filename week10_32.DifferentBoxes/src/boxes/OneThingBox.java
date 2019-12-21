/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Filip
 */
public class OneThingBox extends Box {
    private boolean in=false;
    private Thing thing;
    
    public OneThingBox(){
    }

    @Override
    public void add(Thing t) {
        if(in==true)
            return;
        this.thing=t;
        in=true;
    }

    @Override
    public boolean isInTheBox(Thing t) {
        if(this.thing==null)
            return false;
        if(this.thing.equals(t))
            return true;
        return false;
    }
    
    
}
