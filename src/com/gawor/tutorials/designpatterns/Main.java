package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

import com.gawor.tutorials.designpatterns.strategies.RoadStrategy;
import com.gawor.tutorials.designpatterns.strategies.WalkingStrategy;

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        String A = "Bogota";
        String B = "Warsaw";

        navigator.setRouteStrategy(new RoadStrategy());
        System.out.println(navigator.buildRoute(A, B));

        B = "Bogota west";
        navigator.setRouteStrategy(new WalkingStrategy());
        System.out.println(navigator.buildRoute(A, B));

    }
}
