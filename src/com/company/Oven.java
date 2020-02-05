package com.company;

public class Oven extends Appliance {

    void initTimer (int b ) {
        System.out.println("Таймер на " + b + " минут запущен");
    }

    @Override
    void cook() {

    }
}
