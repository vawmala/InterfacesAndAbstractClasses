package com.company;

abstract class Appliance extends AbstractDevice {

     @Override
     void powerOn () {
         System.out.println("Бытовой прибор включен");
     }
     @Override
     void powerOff () {
         System.out.println("Бытовой прибор выключен");
     }

    abstract void cook ();
}
