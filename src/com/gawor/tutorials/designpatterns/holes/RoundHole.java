package com.gawor.tutorials.designpatterns.holes;

import com.gawor.tutorials.designpatterns.pegs.RoundPeg;

//---// Some Client class that works only with C L I E N T   I N T E R F A C E
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (radius >= peg.getRadius());
        return result;
    }
}
