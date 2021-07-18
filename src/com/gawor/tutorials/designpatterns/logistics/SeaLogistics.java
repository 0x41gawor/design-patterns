package com.gawor.tutorials.designpatterns.logistics;

import com.gawor.tutorials.designpatterns.vehicle.Ship;
import com.gawor.tutorials.designpatterns.vehicle.Vehicle;

//---// C O N C R E T E  C R E A T O R  B
public class SeaLogistics extends Logistics {
    @Override
    public void planDelivery(String order) {
        Vehicle vehicle = createVehicle(order);
        // Call to the ship captain
        // Allocate some resources on the transport path etc.
        // Arrange meetings etc.
        vehicle.deliver();
    }

    //---// F A C T O R Y   M E T H O D
    @Override
    public Vehicle createVehicle(String order) {
        // Select one from available ships and cruises
        // check if it meets the requirements for capacity etc.
        return new Ship();
    }
}
