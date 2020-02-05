package com.company;

public class DialPhone extends Phone implements Caller {
    private String hasAnswerphone;

    @Override
    void powerOn () {
        System.out.println("Подключаем стационарный телефон к сети");
    }
    @Override
    void powerOff () {
        System.out.println("Отключаем стационарный телефон из сети");
    }

    @Override
    public void call() {
        System.out.println("Звоним со стационарного телефона");
    }

    void autoAnswer () {
        System.out.println("Автоответчик сработал на стационарном телефоне");
    }

}
