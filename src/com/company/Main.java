package com.company;



public class Main {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.powerOn();
        mobile.call();
        mobile.powerOff();
        System.out.println();
        DialPhone dialPhone = new DialPhone();
        dialPhone.powerOn();
        dialPhone.call();
        dialPhone.autoAnswer();
        dialPhone.powerOff();
        System.out.println();
        Multicooker multicooker = new Multicooker();
        multicooker.switchProgram(3);
        multicooker.cook();
        System.out.println();
        Oven oven = new Oven();
        oven.initTimer(50);
        oven.cook();
        System.out.println();
        Smartphone smartphone = new Smartphone();
        smartphone.runApp();
        System.out.println();

        System.out.println();
        System.out.println();
        PowerOffAll(mobile, dialPhone, multicooker, oven, smartphone);

    }

    public static void PowerOffAll(AbstractDevice... devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
        }
    }


}
