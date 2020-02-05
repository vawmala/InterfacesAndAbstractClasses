package com.company;

public class Main2 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        System.out.println("Smartphone c интерфейсами");
        smartphone1.call();
        smartphone1.editMail("сообщение");
        System.out.println();
        System.out.println("Стационарный телефон с интерфейсом");
        DialPhone dialPhone1 = new DialPhone();
        dialPhone1.call();
        System.out.println("----------");
        Post post = new Post();
        String mail = post.createMail(" ");
        post.sendMail(mail);
        System.out.println("-----------");
        sendAllMail(smartphone1, post);
    }

    public static void sendAllMail(MailSender... senders) {
        for (MailSender sender : senders) {
            sender.sendMail("Со смартфона и письма с почты");
        }
    }
}



