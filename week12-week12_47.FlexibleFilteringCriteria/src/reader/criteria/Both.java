/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author kevinkerin
 */
public class Both implements Criterion {

    private Criterion cOne;
    private Criterion cTwo;

    public Both(Criterion cOne, Criterion cTwo) {
        this.cOne = cOne;
        this.cTwo = cTwo;
    }
    
    @Override
    public boolean complies(String line) {
        if (cOne.complies(line) && cTwo.complies(line)){
            return true;
        }
        return false;
    }
    
}
