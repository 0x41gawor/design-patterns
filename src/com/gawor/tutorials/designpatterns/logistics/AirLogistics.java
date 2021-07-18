package com.gawor.tutorials.designpatterns.logistics;

import com.gawor.tutorials.designpatterns.vehicle.Airplane;
import com.gawor.tutorials.designpatterns.vehicle.Vehicle;

//---// C O N C R E T E  C R E A T O R  C
public class AirLogistics extends Logistics {
    @Override
    public void planDelivery(String order) {
        Vehicle vehicle = createVehicle(order);
        // Call to the airplane pilot
        // Allocate some resources on the transport path etc.
        // Arrange meetings etc.
        vehicle.deliver();
    }

    //---// F A C T O R Y   M E T H O D
    @Override
    public Vehicle createVehicle(String order) {
        // Select one from available airplanes and pilots
        // check if it meets the requirements for capacity etc.
        return new Airplane();
    }
}
