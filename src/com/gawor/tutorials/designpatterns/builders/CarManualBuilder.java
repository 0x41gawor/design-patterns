package com.gawor.tutorials.designpatterns.builders;

import com.gawor.tutorials.designpatterns.cars.CarManual;
import com.gawor.tutorials.designpatterns.cars.CarType;
import com.gawor.tutorials.designpatterns.cars.components.Engine;
import com.gawor.tutorials.designpatterns.cars.components.GPSNavigator;
import com.gawor.tutorials.designpatterns.cars.components.Transmission;
import com.gawor.tutorials.designpatterns.cars.components.TripComputer;

/*
You might be shocked, but every car needs a manual (seriously, who reads them?).
The manual describes every feature of the car, so the details in the manuals vary across the different models.
That’s why it makes sense to reuse an existing construction process for both real cars and their respective manuals.
Of course, building a manual isn’t the same as building a car, and that’s why we must provide another builder class that specializes in composing manuals.
This class implements the same building methods as its car-building sibling, but instead of crafting car parts, it describes them.
By passing these builders to the same director object, we can construct either a car or a manual.
 */

//---// C O N C E T E   B U I L D E R   2
public class CarManualBuilder implements IBuilder{
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
    @Override
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
    public CarManual getResult() {
        return new CarManual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
