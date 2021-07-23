package com.gawor.tutorials.designpatterns.pegs;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */

//---// S E R V I C E
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    //---// S E R V I C E  M E T H O D  ( S P E C I A L  D A T A)
    public double getSquare() {
        // Normal data is `radius`, but here we have a `width`.
        return Math.pow(width, 2);
    }

}
