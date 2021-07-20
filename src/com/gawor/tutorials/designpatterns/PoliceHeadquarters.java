package com.gawor.tutorials.designpatterns;

//---// C O N C R E T E   S U B S C R I B E R
public class PoliceHeadquarters implements ISubscriber{

    //---// U P D A T E
    @Override
    public void update(String context) {
        System.out.println("Police: Oh, we can buy new " + context + " for our inventory");
    }
}
