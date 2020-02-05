package com.company;

abstract class AbstractDevice {
    private String name;
    private long serialNumber;

    public AbstractDevice() {
        powerOn ();
    }

    abstract void powerOn ();
    abstract void powerOff ();

}
