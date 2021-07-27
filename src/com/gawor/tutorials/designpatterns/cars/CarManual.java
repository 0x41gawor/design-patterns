package com.gawor.tutorials.designpatterns.cars;

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

public class CarManual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public CarManual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
