package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
This example does not refer to problem described in `doc.md`

This simple example shows how an Adapter can make incompatible objects work together.
It is called "Fitting square pegs (tube, pipe) into round holes"

 */

import com.gawor.tutorials.designpatterns.holes.RoundHole;
import com.gawor.tutorials.designpatterns.pegs.RoundPeg;
import com.gawor.tutorials.designpatterns.pegs.SquarePeg;

//---// data - radius
//---// specialData - width

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(4);

        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(7);
        //roundHole.fits(squarePeg); won't compile

        // Adapters solves the problem
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
