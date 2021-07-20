package com.gawor.tutorials.designpatterns;

//---// C O N C R E T E   S U B S C R I B E R
public class CustomerA implements ISubscriber {
    String name;

    public CustomerA(String name) {
        this.name = name;
    }

    //---// U P D A T E
    @Override
    public void update(String context) {
        System.out.println(name + ": Vamos muy rapido, so i can buy this in stock and resell to police");
    }
}
