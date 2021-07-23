package com.gawor.tutorials.designpatterns;

import com.gawor.tutorials.designpatterns.pegs.RoundPeg;
import com.gawor.tutorials.designpatterns.pegs.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */

//---// A D A P T E R
public class SquarePegAdapter extends RoundPeg {

    //---// A D A P T E E
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    //---// M E T H O D  ( D A T A )
    @Override
    public double getRadius() {
        //---// This code is somehow:
        // specialData = convertToServiceFormat(data);
        // return adaptee.serviceMethod(specialData);
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
