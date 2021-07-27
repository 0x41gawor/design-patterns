package com.gawor.tutorials.designpatterns;

import com.gawor.tutorials.designpatterns.builders.IBuilder;
import com.gawor.tutorials.designpatterns.cars.CarType;
import com.gawor.tutorials.designpatterns.cars.components.Engine;
import com.gawor.tutorials.designpatterns.cars.components.GPSNavigator;
import com.gawor.tutorials.designpatterns.cars.components.Transmission;
import com.gawor.tutorials.designpatterns.cars.components.TripComputer;

//---// D I R E C T O R
public class Director {

    //---// no `builder` field in this implementation -> no constructor and `changeBuilder(builder)` then

    //---// M A K E  ( T Y P E )
    public void constructSportsCar(IBuilder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    //---// M A K E  ( T Y P E )
    public void constructCityCar(IBuilder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    //---// M A K E  ( T Y P E )
    public void constructSUV(IBuilder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
