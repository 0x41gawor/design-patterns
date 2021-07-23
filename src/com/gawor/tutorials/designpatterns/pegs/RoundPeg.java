package com.gawor.tutorials.designpatterns.pegs;

/**
 * RoundPegs are compatible with RoundHoles.
 */

//---// C L I E N T  I N T E R F A C E
public class RoundPeg {

    private double radius;

    public RoundPeg() {
        // Need default constructor for SquarePegAdapter.java to compile
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    //---// M E T H O D  ( D A T A )
    public double getRadius() {
        return radius;
    }
}
