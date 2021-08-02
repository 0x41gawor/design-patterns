package com.gawor.tutorials.designpatterns.devices;

//---// I M P L E M E N T A T I O N
public interface IDevice {

    //---// M E T H O D  1  ()
    boolean isEnabled();
    void enable();
    void disable();
    void setVolume(int percent);
    int getVolume();
    void setChannel(int channel);
    int getChannel();
    void printStatus();
    //---// M E T H O D  N  ()
}
