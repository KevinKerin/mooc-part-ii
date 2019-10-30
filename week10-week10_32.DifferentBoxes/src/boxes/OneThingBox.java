/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author kevinkerin
 */
public class OneThingBox extends Box{

    private boolean containsThing;
    private Thing thing;
    
    public OneThingBox(){
        containsThing = false;
    }
    
    @Override
    public void add(Thing thing) {
        if(!containsThing){
            this.thing = thing;
            containsThing = true;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return (thing.equals(this.thing));
    }
    
}
