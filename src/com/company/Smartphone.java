package com.company;

import org.w3c.dom.ls.LSOutput;

public class Smartphone extends Mobile implements Caller, EmailSender {
    private String os;

    void runApp () {
        System.out.println("Приложение запускается");
    }

    @Override
    public void call() {
        System.out.println("Звоним со Смартфона");
    }

    @Override
    public String editMail(String mail) {
        return "Редактирование сообщения" + mail;
    }

    @Override
    public String createMail(String mail) {
        return "Создание сообщения" + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отправка сообщения " + mail);
    }
}
