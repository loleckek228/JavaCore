package com.geekbrains.homework.lesson3.task2;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Дибильный", "89215555555");
        phoneBook.add("Смешной", "89213333333");
        phoneBook.add("Чудная", "89500000000");
        phoneBook.add("Чудная", "89500222222");
        
        phoneBook.get("Дибильный");
        phoneBook.get("Чудная");
        phoneBook.get("Смешной");
        phoneBook.get("Неадекват");
    }
}
