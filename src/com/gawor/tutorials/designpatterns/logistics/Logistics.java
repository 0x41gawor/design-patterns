package com.gawor.tutorials.designpatterns.logistics;

import com.gawor.tutorials.designpatterns.vehicle.Vehicle;

//---// C R E A T O R
public abstract class Logistics {
    public abstract void planDelivery(String order);
    //---// F A C T O R Y   M E T H O D
    public abstract Vehicle createVehicle(String order);
}
