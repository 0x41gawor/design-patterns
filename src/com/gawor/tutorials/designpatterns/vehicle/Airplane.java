package com.gawor.tutorials.designpatterns.vehicle;

//---// C O N C R E T E   P R O D U C T  C
public class Airplane extends Vehicle {

    @Override
    public void deliver() {
        System.out.println("Deliver by sky in a airplane trunk");
    }
}
