package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

// Example is about building cars.
// src: https://refactoring.guru/design-patterns/builder/java/example#example-0--director-Director-java
/*
We have a CAR class and this class is a little complex, because it contains some components objects (engine, transmission, etc.).
Our company factory as for now is obligated to product 3 models of cars. `Director` knows recipes for them.
 */


import com.gawor.tutorials.designpatterns.builders.CarBuilder;
import com.gawor.tutorials.designpatterns.builders.CarManualBuilder;
import com.gawor.tutorials.designpatterns.cars.Car;
import com.gawor.tutorials.designpatterns.cars.CarManual;

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructCityCar(manualBuilder);
        CarManual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
