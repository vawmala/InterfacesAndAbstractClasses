package com.company;

public class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        return "Написание письма " + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отправка сообщения " +  mail);
    }
}
