package com.gawor.tutorials.designpatterns.builders;

import com.gawor.tutorials.designpatterns.cars.Car;
import com.gawor.tutorials.designpatterns.cars.CarType;
import com.gawor.tutorials.designpatterns.cars.components.Engine;
import com.gawor.tutorials.designpatterns.cars.components.GPSNavigator;
import com.gawor.tutorials.designpatterns.cars.components.Transmission;
import com.gawor.tutorials.designpatterns.cars.components.TripComputer;

//---//  C O N C R E T E   B U I L D E R   1
public class CarBuilder implements IBuilder {
    //---// no `result` field in this implementation
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    //---// R E S E T ( )
    @Override
    public void reset() {
        type = null;
        seats = 0;
        engine = null;
        transmission = null;
        tripComputer = null;
        gpsNavigator = null;
    }

    //---// B U I L D   S T E P   A  ( )
    public void setCarType(CarType type) {
        this.type = type;
    }
    //---// B U I L D   S T E P   B  ( ) ...
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    //---// B U I L D   S T E P   Z  ( )
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    //---// G E T   R E S U L T  ( )
    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
