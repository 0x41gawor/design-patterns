package com.gawor.tutorials.designpatterns;

import jdk.swing.interop.SwingInterOpUtils;

//---// C O N T E X T
public class Navigator {

    //---// S T R A T E G Y
    IRouteStrategy routeStrategy;

    //---// S E T  R O U T E  S T R A T E G Y ( )
    public void setRouteStrategy(IRouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    //---// D O  S O M E T H I N G ( )
    public String buildRoute(String A, String B) {
        String route = routeStrategy.buildRoute(A, B);
        return route;
    }
}
