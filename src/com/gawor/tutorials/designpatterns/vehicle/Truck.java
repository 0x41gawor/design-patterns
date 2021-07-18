package com.gawor.tutorials.designpatterns.vehicle;

//---// C O N C R E T E   P R O D U C T  A
public class Truck extends Vehicle {

    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box");
    }
}
