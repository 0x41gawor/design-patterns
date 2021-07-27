package com.gawor.tutorials.designpatterns.builders;

import com.gawor.tutorials.designpatterns.cars.CarType;
import com.gawor.tutorials.designpatterns.cars.components.Engine;
import com.gawor.tutorials.designpatterns.cars.components.GPSNavigator;
import com.gawor.tutorials.designpatterns.cars.components.Transmission;
import com.gawor.tutorials.designpatterns.cars.components.TripComputer;

//---// I N T E R F A C E   B U I L D E R
public interface IBuilder {
    //---// R E S E T ( )
    void reset();
    //---// B U I L D   S T E P   A  ( )
    void setCarType(CarType type);
    //---// B U I L D   S T E P   B  ( ) ...
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    //---// B U I L D   S T E P   Z  ( )
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
