package com.company;

class Mobile extends Phone {
    private String simcount;
    private String display;

    @Override
    void powerOn () {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается");
    }

    @Override
    void powerOff () {
        System.out.println("Зажимаем кнопку выключения. Мобильный телефон отключается");
    }

    @Override
    void call() {
        System.out.println("Звоним");
    }
}
