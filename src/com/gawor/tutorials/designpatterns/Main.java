package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to doc.md/Structure image
 */

import com.gawor.tutorials.designpatterns.logistics.AirLogistics;
import com.gawor.tutorials.designpatterns.logistics.LandLogistics;
import com.gawor.tutorials.designpatterns.logistics.Logistics;
import com.gawor.tutorials.designpatterns.logistics.SeaLogistics;

//---// C L I E N T  C O D E
public class Main {

    public static void main(String[] args) {
        // We've got the order to realise
        String order = "Bogota to Warsaw, 2 tons of coke";
        // Create logistics for the order
        Logistics logistics;
        // Assign type of logistics to order
        switch (assignCategory(order)) {
            case 1:
                logistics = new LandLogistics();
                break;
            case 2:
                logistics = new SeaLogistics();
                break;
            case 3:
                logistics = new AirLogistics();
            default:
                logistics = null;
        }
        //realise the order (it's delivery)
        logistics.planDelivery(order);
    }

    public static int assignCategory(String order) {
        // This Business logic assigns category to order
        // Category is a number that specifies which way of logistics use: land, sea or sky.
        // It checks the source and destination addresses, looks if it can be realised on land, checks the distance etc.
        return 2;
    }
}
