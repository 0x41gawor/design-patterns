package com.gawor.tutorials.designpatterns.vehicle;

//---// C O N C R E T E   P R O D U C T  B
public class Ship extends Vehicle {

    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container");
    }
}
