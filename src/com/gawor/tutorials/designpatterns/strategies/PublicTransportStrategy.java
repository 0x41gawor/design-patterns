package com.gawor.tutorials.designpatterns.strategies;

import com.gawor.tutorials.designpatterns.IRouteStrategy;

//---// C O N C R E T E   S T R A T E G Y   B
public class PublicTransportStrategy implements IRouteStrategy {

    //---// E X E C U T E ( )
    @Override
    public String buildRoute(String A, String B) {
        return "Route from " + A + " to " + B + " using public transport";
    }
}
