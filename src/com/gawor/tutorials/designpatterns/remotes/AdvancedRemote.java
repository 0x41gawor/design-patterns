package com.gawor.tutorials.designpatterns.remotes;

import com.gawor.tutorials.designpatterns.devices.IDevice;

//---// R E F I N E D   A B S T R A C T I O N
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(IDevice device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
