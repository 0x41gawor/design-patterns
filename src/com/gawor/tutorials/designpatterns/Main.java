package com.gawor.tutorials.designpatterns;

// Problem discussed in `doc.md` in "Problem" chapter
// One of the buildings is a Police headquarters and they would like to buy some brand new IPhones for the bureau
// We also have some basic customers

/*
Comments in this case:
//---// T H I S   C A S E
refer to doc.md/Structure image
 */

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {
        // Publisher object (Store will notify about new products)
        Store store = new Store();

        // Subscriber objects
        CustomerA joe = new CustomerA("Joe");
        CustomerB frank = new CustomerB("Frank");
        PoliceHeadquarters police = new PoliceHeadquarters();

        store.subscribe(joe);
        store.subscribe(frank);
        store.subscribe(police);

        // Desired product arrives
        store.mainBusinessLogic();
    }
}
