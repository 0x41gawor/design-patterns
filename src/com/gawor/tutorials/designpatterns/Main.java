package com.gawor.tutorials.designpatterns;

import com.gawor.tutorials.designpatterns.devices.IDevice;
import com.gawor.tutorials.designpatterns.devices.Radio;
import com.gawor.tutorials.designpatterns.devices.TV;
import com.gawor.tutorials.designpatterns.remotes.AdvancedRemote;
import com.gawor.tutorials.designpatterns.remotes.BasicRemote;
/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
    This example shows separation between the classes of remotes and devices that they control.

    Remotes act as abstractions, and devices are their implementations.
    Thanks to the common interfaces, the same remotes can work with different devices and vice versa.

    The Bridge pattern allows changing or even creating new classes without touching the code of the opposite hierarchy.
 */



//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(IDevice device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
